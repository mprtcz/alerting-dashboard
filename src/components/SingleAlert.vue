<template>
  <div class="alert-top" :style="alertStyle">
    <LinkIcons :icons="alert.links" />
    <div class="app-name">{{ transformName(alert.application) }}</div>
    <div class="all-alerts">
      <div v-for="(detail, index) in alert.groupedFields" :key="index" class="single-alert">
        <div v-if="showName" class="alert-detail">{{ detail.name }}</div>
        <div v-if="showOutput" class="alert-detail">{{ detail.output }}</div>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <a v-if="detail.url" :href="detail.url" target="_blank">
          <i class="material-icons">open_in_new</i>
        </a>
      </div>
    </div>
  </div>
</template>

<script>
import LinkIcons from "./LinkIcons.vue";

export default {
  name: "SingleAlert",
  components: {
    LinkIcons,
  },
  props: {
    alert: {
      type: Object,
      required: true,
    },
  },
  computed: {
    alertColor() {
      switch (this.alert.status) {
        case "0":
          return "#A5D6A7"; // Light Green
        case "1":
          return "#FFE082"; // Light Yellow
        case "2":
          return "#E57373"; // Light Red
        default:
          return "#FFFFFF"; // Default to white if status is unknown
      }
    },
    alertStyle() {
      return {
        padding: "10px",
        margin: "5px",
        borderRadius: "5px",
        backgroundColor: this.alertColor,
      };
    },
  },
  methods: {
    transformName(name) {
      return name
        .split('-')
        .map(word => word.charAt(0).toUpperCase() + word.slice(1))
        .join(' ');
    },
  },
  inject: ['showName', 'showOutput']
};
</script>

<style>
.alert-top {
  padding: 10px;
  margin: 5px;
  border-radius: 5px;
  display: flex;
  flex-direction: row-reverse;
}

.app-name {
  font-weight: bold;
  width: 15%;
  word-wrap: break-word;
  word-break: break-all;
  text-align: right;
  margin: 0 10px 0 10px;
}

.single-alert {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  padding: 5px;
  border: 1px solid #000;
  border-radius: 5px;
  margin: 5px;
}

.all-alerts {
  display: flex;
  flex-direction: column;
  width: 85%;
  text-align: left;
}

.alert-detail {
  width: 450%
}
</style>
