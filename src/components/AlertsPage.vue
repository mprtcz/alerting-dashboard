<template>
  <CountdownBar  v-if="refreshSeconds" :duration="refreshSeconds" @countdown-finished="refreshPage"/>
  <AlertsList/>
</template>

<script>
import CountdownBar from './CountdownBar.vue';
import AlertsList from './AlertsList.vue';

export default {
  name: 'AlertsPage',
  components: {
    CountdownBar,
    AlertsList,
  },
  data() {},
  watch: {
    '$route.query': {
      handler(newQuery) {
        this.refreshSeconds = newQuery.refresh; // Update the query value when the route changes
      },
      immediate: true,
    },
  },
  methods: {
    refreshPage() {
      // Logic to refresh the component, e.g., re-fetch data or reload the route
      this.$router.go(0); // Reload the current route
    }
  }
};
</script>

<style scoped>
/* Add any styles specific to AlertsPage here */
</style>