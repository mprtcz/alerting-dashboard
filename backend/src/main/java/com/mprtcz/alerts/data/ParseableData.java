package com.mprtcz.alerts.data;

import java.util.List;
import java.util.Map;
import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ParseableData {
    private String client;
    private ParseableCheck check;

    public ParseableData(String client, ParseableCheck check) {
        this.client = client;
        this.check = check;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public ParseableCheck getCheck() {
        return check;
    }

    public void setCheck(ParseableCheck check) {
        this.check = check;
    }

    public static ParseableData createData(String client, String application, String name, String output, String status,
            String kibanaLogs, String kibanaAccessLogs, String kubernetes, String jenkins,
            String bitbucket, String swagger, Map<String, String> grafana, String url) {
                ParseableLinks links = new ParseableLinks(kibanaLogs, kibanaAccessLogs, kubernetes, jenkins, bitbucket, swagger, grafana);
        ParseableCheck check = new ParseableCheck(application, name, output, status, links, url);
        return new ParseableData(client, check);
    }

    public static List<ParseableData> parseJsonToList(String jsonString) {
        Gson gson = new Gson();
        Type dataListType = new TypeToken<List<ParseableData>>(){}.getType();
        return gson.fromJson(jsonString, dataListType);
    }
}

class ParseableCheck {
    private String application;
    private String name;
    private String output;
    private String status;
    private ParseableLinks links;
    private String url;

    public ParseableCheck(String application, String name, String output, String status, ParseableLinks links, String url) {
        this.application = application;
        this.name = name;
        this.output = output;
        this.status = status;
        this.links = links;
        this.url = url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ParseableLinks getLinks() {
        return links;
    }

    public void setLinks(ParseableLinks links) {
        this.links = links;
    }

    public String getUrl() {
        return url;
    }
}

class ParseableLinks {
    private String kibanaLogs;
    private String kibanaAccessLogs;
    private String kubernetes;
    private String jenkins;
    private String bitbucket;
    private String swagger;
    private Map<String, String> grafana;

    public ParseableLinks(String kibanaLogs, String kibanaAccessLogs, String kubernetes, String jenkins, String bitbucket, String swagger, Map<String, String> grafana) {
        this.kibanaLogs = kibanaLogs;
        this.kibanaAccessLogs = kibanaAccessLogs;
        this.kubernetes = kubernetes;
        this.jenkins = jenkins;
        this.bitbucket = bitbucket;
        this.swagger = swagger;
        this.grafana = grafana;
    }

    public String getKibanaLogs() {
        return kibanaLogs;
    }

    public void setKibanaLogs(String kibanaLogs) {
        this.kibanaLogs = kibanaLogs;
    }

    public String getKibanaAccessLogs() {
        return kibanaAccessLogs;
    }

    public void setKibanaAccessLogs(String kibanaAccessLogs) {
        this.kibanaAccessLogs = kibanaAccessLogs;
    }

    public String getKubernetes() {
        return kubernetes;
    }

    public void setKubernetes(String kubernetes) {
        this.kubernetes = kubernetes;
    }

    public String getJenkins() {
        return jenkins;
    }

    public void setJenkins(String jenkins) {
        this.jenkins = jenkins;
    }

    public String getBitbucket() {
        return bitbucket;
    }

    public void setBitbucket(String bitbucket) {
        this.bitbucket = bitbucket;
    }

    public String getSwagger() {
        return swagger;
    }

    public void setSwagger(String swagger) {
        this.swagger = swagger;
    }

    public Map<String, String> getGrafana() {
        return grafana;
    }

    public void setGrafana(Map<String, String> grafana) {
        this.grafana = grafana;
    }
}