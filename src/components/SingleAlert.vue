<template>
  <div class="alert">
    {{ alert.check.application }}
  </div>
</template>

<script>
export default {
  name: 'SingleAlert',
  props: {
    alert: {
      type: Object,
      required: true
    }
  }
}
</script>

<style>
.alert {
  padding: 10px;
  margin: 5px;
  border: 1px solid #ccc;
  border-radius: 5px;
}
</style>