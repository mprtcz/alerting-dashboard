<template>
    <AlertDetailsToggle @update:showName="updateShowName" @update:showOutput="updateShowOutput" />
    <CountdownBar v-if="refreshSeconds" :duration="refreshSeconds" @countdown-finished="refreshPage" />
    <AlertsList />
</template>

<script>
import { reactive, toRefs } from 'vue';
import CountdownBar from './CountdownBar.vue';
import AlertsList from './AlertsList.vue';
import AlertDetailsToggle from './AlertDetailsToggle.vue';

export default {
    name: 'AlertsPage',
    components: {
        CountdownBar,
        AlertsList,
        AlertDetailsToggle,
    },
    setup() {
        const state = reactive({
            showName: true,
            showOutput: true,
        });

        const updateShowName = (value) => {
            state.showName = value;
            console.log("updated!");
        };

        const updateShowOutput = (value) => {
            state.showOutput = value;
        };

        return {
            ...toRefs(state),
            updateShowName,
            updateShowOutput,
        };
    },
    provide() {
        const state = reactive({
            showName: true,
            showOutput: true,
        });

        return {
            showName: state.showName,
            showOutput: state.showOutput,
        };
    },
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