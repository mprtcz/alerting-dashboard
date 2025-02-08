<template>
  <div>
    <h1>Alerts</h1>
    <div :style="gridStyle">
      <div v-for="alert in sortedAlerts" :key="alert.id" class="alert-item">
        <SingleAlert :alert="alert" />
      </div>
    </div>
  </div>
</template>

<script>
import $ from "jquery";
import SingleAlert from "./SingleAlert.vue";

export default {
  name: "AlertsList",
  components: {
    SingleAlert,
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
    gridStyle() {
      return {
        display: "grid",
        gridTemplateColumns: `repeat(${this.columns}, 1fr)`,
        gap: "10px",
      };
    },
  },
  mounted() {
    // Extract columns parameter from URL
    this.columns = parseInt(this.$route.query.columns) || 1;

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
