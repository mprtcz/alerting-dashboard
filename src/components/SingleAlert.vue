<template>
  <div class="alert" :style="alertStyle">
    <div class="app-name">{{ alert.application }}</div>
    <div v-for="(detail, index) in alert.groupedFields" :key="index">
      <div>{{ detail.name }}</div>
      <div>{{ detail.output }}</div>
    </div>
    <LinkIcons :icons="alert.links" />
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
          return "#FFF59D"; // Light Yellow
        case "2":
          return "#EF9A9A"; // Light Red
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
};
</script>

<style>
.alert {
  padding: 10px;
  margin: 5px;
  border: 1px solid #ccc;
  border-radius: 5px;
}

.app-name {
  font-weight: bold;
}
</style>
