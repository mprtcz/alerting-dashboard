<template>
    <div>
        <h1>Alerts</h1>
        <ul>
            <li v-for="alert in sortedAlerts" :key="alert.id">
                <SingleAlert :alert="alert" />
            </li>
        </ul>
    </div>
</template>

<script>
import $ from 'jquery'
import SingleAlert from './SingleAlert.vue'

export default {
    name: 'AlertsList',
    components: {
        SingleAlert
    },
    data() {
        return {
            alerts: []
        }
    },
    computed: {
        sortedAlerts() {
            return this.alerts.slice().sort((a, b) => a.check.status - b.check.status)
        }
    },
    mounted() {
        $.ajax({
            url: 'http://localhost:8081/data',
            method: 'GET',
            success: (response) => {
                this.alerts = response
                console.log('Alerts fetched:', response);
            },
            error: (error) => {
                console.error('There was an error fetching the alerts:', error)
            }
        })
    }
}
</script>

<style>
/* Add your styles here */
</style>