<template>
    <div class="countdown-bar-container">
      <div class="countdown-bar" :style="{ width: barWidth + '%' }"></div>
    </div>
  </template>
  
  <script>
  export default {
    name: 'CountdownBar',
    props: {
      duration: {
        type: Number,
        required: true
      }
    },
    data() {
      return {
        barWidth: 100,
        intervalId: null
      };
    },
    mounted() {
      this.startCountdown();
    },
    beforeUnmount() {
      clearInterval(this.intervalId);
    },
    methods: {
      startCountdown() {
        const startTime = Date.now();
        const endTime = startTime + this.duration * 1000;
  
        this.intervalId = setInterval(() => {
          const currentTime = Date.now();
          const timeLeft = endTime - currentTime;
          this.barWidth = (timeLeft / (this.duration * 1000)) * 100;
  
          if (timeLeft <= 0) {
            clearInterval(this.intervalId);
            this.barWidth = 0;
            this.$emit('countdown-finished');
          }
        }, 100);
      }
    }
  };
  </script>
  
  <style>
  .countdown-bar-container {
    width: 100%;
    height: 10px;
    background-color: #e0e0e0;
    border-radius: 5px;
    overflow: hidden;
  }
  
  .countdown-bar {
    height: 100%;
    background-color: #42b983;
    transition: width 0.1s linear;
  }
  </style>