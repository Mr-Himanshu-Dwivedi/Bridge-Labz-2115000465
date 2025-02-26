package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Q5_ValidateJson {
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"John Doe\",\"age\":20,\"email\":\"john.doe@example.com\"}";

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            System.out.println("JSON is valid.");
            System.out.println("Parsed JSON: " + jsonNode.toString());

        } catch (Exception e) {
            System.err.println("Invalid JSON structure: " + e.getMessage());
        }
    }
}
