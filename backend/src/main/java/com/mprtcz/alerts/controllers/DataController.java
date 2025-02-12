package com.mprtcz.alerts.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mprtcz.alerts.data.Data;

@RestController
public class DataController {

    @GetMapping("/data")
    public List<Data> getData() {
        Data data1 = Data.createData("prometheus", "article-shop-quantity-reader",
                "article-shop-quantity-reader.NonEmptyListCheck",
                "Application article-shop-quantity-reader alert returns non empty list. Please check article-shop-quantity-reader.private.zooplus.net/v1/alerting/availability-discrepancy",
                "2", "https://kibana.private.zooplus.net/s/sourcing/...",
                "https://kibana.private.zooplus.net/s/sourcing/app/...",
                "https://dashboard-sourcing-k8s-prod...", "https://sourcing-jenkins.cicdk8sp...",
                "https://src.private.zooplus.net/plugins/...",
                "https://...", Map.of("Grafana (Prometheus)", "https://grafana.private.zooplus.net/d/..."));

        Data data2 = Data.createData("Client2", "application2", "name2", "output2", "1",
                "kibanaLogs2", "kibanaAccessLogs2", "kubernetes2", "jenkins2", "bitbucket2", "swagger2",
                Map.of("grafanaKey2", "grafanaValue2"));

        Data data3 = Data.createData("Client3", "application3", "name3", "output3", "0",
                "kibanaLogs3", "kibanaAccessLogs3", "kubernetes3", "jenkins3", "bitbucket3", "swagger3",
                Map.of("grafanaKey3", "grafanaValue3"));

        return List.of(data1, data2, data3);
    }

}
