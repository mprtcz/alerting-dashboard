package com.mprtcz.alerts.data;

import java.util.Map;

public record Data(String client, Check check) {

    public static Data createData(String client, String application, String name, String output, String status,
            String kibanaLogs, String kibanaAccessLogs, String kubernetes, String jenkins,
            String bitbucket, String swagger, Map<String, String> grafana) {
        Links links = new Links(kibanaLogs, kibanaAccessLogs, kubernetes, jenkins, bitbucket, swagger, grafana);
        Check check = new Check(application, name, output, status, links);
        return new Data(client, check);
    }
}

record Check(String application, String name, String output, String status, Links links) {
}

record Links(String kibanaLogs, String kibanaAccessLogs, String kubernetes, String jenkins, String bitbucket,
        String swagger, Map<String, String> grafana) {
}