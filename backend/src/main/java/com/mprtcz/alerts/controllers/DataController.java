package com.mprtcz.alerts.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mprtcz.alerts.data.ParseableData;

@RestController
public class DataController {

    @GetMapping("/data")
    public List<ParseableData> getData() {
        return ParseableData.parseJsonToList("""
[
    {
        "client": "ih-monitoring",
        "check": {
            "application": null,
            "name": "inventory-health-management.health",
            "output": "CheckHttp OK: 200, 760 bytes\n",
            "status": 0,
            "links": {
                "kibanaLogs": null,
                "kibanaAccessLogs": null,
                "kubernetes": null,
                "jenkins": null,
                "bitbucket": null,
                "swagger": null,
                "grafana": null,
                "uchiwa": null
            }
        }
    },
    {
        "client": "ih-monitoring",
        "check": {
            "application": null,
            "name": "expiry-management-api.pricing_report",
            "output": "ESQueryCount CRITICAL: Query count (0) was below critical threshold. \n",
            "status": 2,
            "links": {
                "kibanaLogs": null,
                "kibanaAccessLogs": null,
                "kubernetes": null,
                "jenkins": null,
                "bitbucket": null,
                "swagger": null,
                "grafana": null,
                "uchiwa": null
            }
        }
    },
    {
        "client": "ih-monitoring",
        "check": {
            "application": null,
            "name": "fs-parcel-steering-cost-service.health",
            "output": "CheckJson OK: key has expected value: 'status' \n",
            "status": 0,
            "links": {
                "kibanaLogs": null,
                "kibanaAccessLogs": null,
                "kubernetes": null,
                "jenkins": null,
                "bitbucket": null,
                "swagger": null,
                "grafana": null,
                "uchiwa": null
            }
        }
    },
    {
        "client": "ih-monitoring",
        "check": {
            "application": null,
            "name": "inventory-health-management.version",
            "output": "Last check execution was 11055916 seconds ago",
            "status": 1,
            "links": {
                "kibanaLogs": null,
                "kibanaAccessLogs": null,
                "kubernetes": null,
                "jenkins": null,
                "bitbucket": null,
                "swagger": null,
                "grafana": null,
                "uchiwa": null
            }
        }
    },
    {
        "client": "ih-monitoring",
        "check": {
            "application": null,
            "name": "inventory-health-external-data-service.health",
            "output": "CheckJson OK: key has expected value: 'status' \n",
            "status": 0,
            "links": {
                "kibanaLogs": null,
                "kibanaAccessLogs": null,
                "kubernetes": null,
                "jenkins": null,
                "bitbucket": null,
                "swagger": null,
                "grafana": null,
                "uchiwa": null
            }
        }
    },
    {
        "client": "ih-monitoring",
        "check": {
            "application": null,
            "name": "inventory-health-management_error_count",
            "output": "ESQueryCount OK: Query count (0) was ok\n",
            "status": 0,
            "links": {
                "kibanaLogs": null,
                "kibanaAccessLogs": null,
                "kubernetes": null,
                "jenkins": null,
                "bitbucket": null,
                "swagger": null,
                "grafana": null,
                "uchiwa": null
            }
        }
    },
    {
        "client": "ih-monitoring",
        "check": {
            "application": null,
            "name": "fs-parcel-steering-cost-service.exceeding_range_steering",
            "output": "CheckHttp OK: 200, found /^\\\\[\\\\]$/ in 2 bytes\\\n",
            "status": 0,
            "links": {
                "kibanaLogs": null,
                "kibanaAccessLogs": null,
                "kubernetes": null,
                "jenkins": null,
                "bitbucket": null,
                "swagger": null,
                "grafana": null,
                "uchiwa": null
            }
        }
    },
    {
        "client": "ih-monitoring",
        "check": {
            "application": null,
            "name": "fs-parcel-steering-cost-service.duplicated_steering",
            "output": "CheckHttp OK: 200, found /^\\\\[\\\\]$/ in 2 bytes\n",
            "status": 0,
            "links": {
                "kibanaLogs": null,
                "kibanaAccessLogs": null,
                "kubernetes": null,
                "jenkins": null,
                "bitbucket": null,
                "swagger": null,
                "grafana": null,
                "uchiwa": null
            }
        }
    },
    {
        "client": "ih-monitoring",
        "check": {
            "application": null,
            "name": "expiry-management-api.health",
            "output": "CheckJson OK: key has expected value: 'status' \n",
            "status": 0,
            "links": {
                "kibanaLogs": null,
                "kibanaAccessLogs": null,
                "kubernetes": null,
                "jenkins": null,
                "bitbucket": null,
                "swagger": null,
                "grafana": null,
                "uchiwa": null
            }
        }
    },
    {
        "client": "ih-monitoring",
        "check": {
            "application": null,
            "name": "keepalive",
            "output": "Keepalive sent from client 13 seconds ago",
            "status": 0,
            "links": {
                "kibanaLogs": null,
                "kibanaAccessLogs": null,
                "kubernetes": null,
                "jenkins": null,
                "bitbucket": null,
                "swagger": null,
                "grafana": null,
                "uchiwa": null
            }
        }
    },
    {
        "client": "ih-monitoring",
        "check": {
            "application": null,
            "name": "expiry-management-api.version",
            "output": "Last check execution was 11056106 seconds ago",
            "status": 1,
            "links": {
                "kibanaLogs": null,
                "kibanaAccessLogs": null,
                "kubernetes": null,
                "jenkins": null,
                "bitbucket": null,
                "swagger": null,
                "grafana": null,
                "uchiwa": null
            }
        }
    },
    {
        "client": "ih-monitoring",
        "check": {
            "application": null,
            "name": "fs-parcel-steering-cost.errors",
            "output": "ESQueryCount OK: Query count (0) was ok\n",
            "status": 0,
            "links": {
                "kibanaLogs": null,
                "kibanaAccessLogs": null,
                "kubernetes": null,
                "jenkins": null,
                "bitbucket": null,
                "swagger": null,
                "grafana": null,
                "uchiwa": null
            }
        }
    },
    {
        "client": "ih-monitoring",
        "check": {
            "application": null,
            "name": "fs-parcel-steering-cost.version",
            "output": "Last check execution was 11055915 seconds ago",
            "status": 1,
            "links": {
                "kibanaLogs": null,
                "kibanaAccessLogs": null,
                "kubernetes": null,
                "jenkins": null,
                "bitbucket": null,
                "swagger": null,
                "grafana": null,
                "uchiwa": null
            }
        }
    },
    {
        "client": "ih-monitoring",
        "check": {
            "application": null,
            "name": "fs-parcel-steering-cost-service.failed_generating_calculation_commands",
            "output": "ESQueryCount OK: Query count (2) was ok\n",
            "status": 0,
            "links": {
                "kibanaLogs": null,
                "kibanaAccessLogs": null,
                "kubernetes": null,
                "jenkins": null,
                "bitbucket": null,
                "swagger": null,
                "grafana": null,
                "uchiwa": null
            }
        }
    },
    {
        "client": "ih-monitoring",
        "check": {
            "application": null,
            "name": "inventory-health-management.errors",
            "output": "ESQueryCount OK: Query count (0) was ok\n",
            "status": 0,
            "links": {
                "kibanaLogs": null,
                "kibanaAccessLogs": null,
                "kubernetes": null,
                "jenkins": null,
                "bitbucket": null,
                "swagger": null,
                "grafana": null,
                "uchiwa": null
            }
        }
    },
    {
        "client": "ih-monitoring",
        "check": {
            "application": null,
            "name": "inventory-health-external-data-service.version",
            "output": "Last check execution was 11055526 seconds ago",
            "status": 1,
            "links": {
                "kibanaLogs": null,
                "kibanaAccessLogs": null,
                "kubernetes": null,
                "jenkins": null,
                "bitbucket": null,
                "swagger": null,
                "grafana": null,
                "uchiwa": null
            }
        }
    },
    {
        "client": "ih-monitoring",
        "check": {
            "application": null,
            "name": "fs-parcel-steering-cost-service.not_refreshed_steering",
            "output": "CheckHttp OK: 200, found /^\\\\[\\\\]$/ in 2 bytes\n",
            "status": 0,
            "links": {
                "kibanaLogs": null,
                "kibanaAccessLogs": null,
                "kubernetes": null,
                "jenkins": null,
                "bitbucket": null,
                "swagger": null,
                "grafana": null,
                "uchiwa": null
            }
        }
    },
    {
        "client": "ih-monitoring",
        "check": {
            "application": null,
            "name": "fs-parcel-steering-cost-service_error_count",
            "output": "ESQueryCount OK: Query count (0) was ok\n",
            "status": 0,
            "links": {
                "kibanaLogs": null,
                "kibanaAccessLogs": null,
                "kubernetes": null,
                "jenkins": null,
                "bitbucket": null,
                "swagger": null,
                "grafana": null,
                "uchiwa": null
            }
        }
    },
    {
        "client": "ih-monitoring",
        "check": {
            "application": null,
            "name": "fs-parcel-steering-cost.health",
            "output": "CheckHttp OK: 200, 655 bytes\n",
            "status": 0,
            "links": {
                "kibanaLogs": null,
                "kibanaAccessLogs": null,
                "kubernetes": null,
                "jenkins": null,
                "bitbucket": null,
                "swagger": null,
                "grafana": null,
                "uchiwa": null
            }
        }
    },
    {
        "client": "ih-monitoring",
        "check": {
            "application": null,
            "name": "fs-parcel-steering-cost-service.version",
            "output": "Last check execution was 11056178 seconds ago",
            "status": 1,
            "links": {
                "kibanaLogs": null,
                "kibanaAccessLogs": null,
                "kubernetes": null,
                "jenkins": null,
                "bitbucket": null,
                "swagger": null,
                "grafana": null,
                "uchiwa": null
            }
        }
    },
    {
        "client": "ih-monitoring",
        "check": {
            "application": null,
            "name": "inventory-health-external-data-service_error_count",
            "output": "ESQueryCount OK: Query count (0) was ok\n",
            "status": 0,
            "links": {
                "kibanaLogs": null,
                "kibanaAccessLogs": null,
                "kubernetes": null,
                "jenkins": null,
                "bitbucket": null,
                "swagger": null,
                "grafana": null,
                "uchiwa": null
            }
        }
    },
    {
        "client": "ih-monitoring",
        "check": {
            "application": null,
            "name": "expiry-management-api_error_count",
            "output": "ESQueryCount OK: Query count (0) was ok\n",
            "status": 0,
            "links": {
                "kibanaLogs": null,
                "kibanaAccessLogs": null,
                "kubernetes": null,
                "jenkins": null,
                "bitbucket": null,
                "swagger": null,
                "grafana": null,
                "uchiwa": null
            }
        }
    }
]
                        """);
    }

}
