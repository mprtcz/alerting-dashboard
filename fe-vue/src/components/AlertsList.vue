<template>
  <CountdownBar  v-if="duration" :duration="60" />
  <div>
    <div>
      <div v-for="alert in alertsGroupedBySeverity[2]" :key="alert.id" class="alert-item">
        <SingleAlert :alert="alert" />
      </div>
      <div v-for="alert in alertsGroupedBySeverity[1]" :key="alert.id" class="alert-item">
        <SingleAlert :alert="alert" />
      </div>
      <div v-for="alert in alertsGroupedBySeverity[0]" :key="alert.id" class="alert-item">
        <SingleAlert :alert="alert" />
      </div>
    </div>
  </div>
</template>

<script>
import $ from "jquery";
import SingleAlert from "./SingleAlert.vue";
import { toRaw } from 'vue';
import CountdownBar from "./CountdownBar.vue";

export default {
  name: "AlertsList",
  components: {
    SingleAlert,
    CountdownBar,
  },
  data() {
    return {
      alerts: [],
      columns: 1,
    };
  },
  computed: {
    sortedAlerts() {
      return this.alerts
        .slice()
        .sort((a, b) => b.check.status - a.check.status);
    },
    alertsGroupedBySeverity() {
      if (!this.alerts || this.alerts.length == 0) return [];
      const groupedAlerts = this.alerts.reduce((acc, alert) => {
        if (!acc[alert.check.status]) {
          acc[alert.check.status] = [];
        }
        acc[alert.check.status].push(alert);
        return acc;
      }, {});

      const groupedByApplication = {};

      for (const [key, objects] of Object.entries(groupedAlerts)) {
        groupedByApplication[key] = Object.values(objects.reduce((acc, obj) => {
          const key = obj.check.application;

          if (!acc[key]) {
            acc[key] = { application: obj.check.application, groupedFields: [], links: obj.check.links, status: obj.check.status };
          }

          acc[key].groupedFields.push({ name: obj.check.name, output: obj.check.output, url: obj.check.url });

          return acc;
        }, {}));
      }
      console.log(toRaw(groupedByApplication))

      return groupedByApplication;
    },
    gridStyle() {
      return {
        display: "flex",
        flexDirection: "column",
        justifyContent: "center",
        flexWrap: "wrap",
      };
    },
  },
  mounted() {
    // Extract columns parameter from URL
    this.columns = parseInt(this.$route.query.columns) || 1;
    console.log(this.refreshSeconds);

    $.ajax({
      url: "http://localhost:8081/data",
      method: "GET",
      success: (response) => {
        this.alerts = response;
      },
      error: (error) => {
        console.error("There was an error fetching the alerts:", error);
      },
    });
  },
};
</script>

<style></style>
