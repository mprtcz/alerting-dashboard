<template>
  <div>
    <button @click="toggleMenu">
      Links
      <span
        :class="{ 'triangle-up': showMenu, 'triangle-down': !showMenu }"
      ></span>
    </button>
    <div v-if="showMenu" class="menu">
      <a
        v-for="(url, key) in icons"
        :key="key"
        :href="getUrl(url, key)"
        target="_blank"
        class="icon-link"
      >
        <img :src="getIconSrc(key)" :alt="key" class="service-icon" />
      </a>
    </div>
  </div>
</template>

<script>
export default {
  name: "LinkIcons",
  data() {
    return {
      showMenu: false,
    };
  },
  props: {
    icons: {
      type: Object,
      required: true,
    },
  },
  methods: {
    toggleMenu() {
      this.showMenu = !this.showMenu;
    },
    getUrl(url, key) {
      if (key === "grafana") {
        return url["Grafana (Prometheus)"];
      }
      return url;
    },

    getIconSrc(key) {
      switch (key) {
        case "kibanaLogs":
          return require("@/assets/kibana.png");
        case "kibanaAccessLogs":
          return require("@/assets/kibanaAccessLogs.png");
        case "kubernetes":
          return require("@/assets/kubernetes.png");
        case "jenkins":
          return require("@/assets/jenkins.png");
        case "bitbucket":
          return require("@/assets/bitbucket.png");
        case "swagger":
          return require("@/assets/swagger.png");
        case "grafana":
          return require("@/assets/grafana.png");
        default:
          return "";
      }
    },
  },
};
</script>

<style>
.icon-link {
  margin: 0 10px;
}

.service-icon {
  width: 24px;
  height: 24px;
}

button {
  background-color: #f0f0f0;
  border: none;
  padding: 10px;
  cursor: pointer;
}

.triangle-down::after {
  content: "▼";
}

.triangle-up::after {
  content: "▲";
}

.menu {
  position: absolute;
  background-color: white;
  border: 1px solid #ccc;
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
  margin-top: 5px;
  padding: 10px;
}

.menu-item {
  padding: 5px 10px;
  cursor: pointer;
}

.menu-item:hover {
  background-color: #f0f0f0;
}
</style>
