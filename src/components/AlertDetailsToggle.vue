<template>
    <div class="alert-details-toggle">
        <label>
            <input type="checkbox" v-model="showName" @change="emitShowName" />
            Show Name
        </label>
        <label>
            <input type="checkbox" v-model="showOutput" @change="emitShowOutput" />
            Show Output
        </label>
    </div>
</template>

<script>
export default {
    data() {
        return {
            showName: true,
            showOutput: true,
        };
    },
    methods: {
        emitShowName() {
            this.$emit('update:showName', this.showName);
            console.log("emitted!");
        },
        emitShowOutput() {
            this.$emit('update:showOutput', this.showOutput);
        },
    },
    provide() {
        return {
            showName: this.showName,
            showOutput: this.showOutput,
        };
    },
};
</script>

<style>
.alert-details-toggle {
    color: white;
    text-align: left;
}
</style>