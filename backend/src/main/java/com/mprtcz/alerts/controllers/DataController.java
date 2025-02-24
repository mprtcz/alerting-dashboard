package com.mprtcz.alerts.controllers;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mprtcz.alerts.data.ParseableData;

@RestController
public class DataController {

    @GetMapping("/data")
    public List<ParseableData> getData() throws IOException {
        String jsonString = readJsonFile("response.json");
        return ParseableData.parseJsonToList(jsonString);
    }

    private String readJsonFile(String fileName) throws IOException {
        ClassPathResource resource = new ClassPathResource(fileName);
        try (InputStream inputStream = resource.getInputStream()) {
            return StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);
        }
    }

}
