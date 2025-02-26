package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Q7_FilterJsonByAge {
    public static void main(String[] args) {
        String jsonString = "[" +
                "{\"name\":\"John Doe\",\"age\":20,\"email\":\"john.doe@example.com\"}," +
                "{\"name\":\"Jane Smith\",\"age\":30,\"email\":\"jane.smith@example.com\"}," +
                "{\"name\":\"Sam Wilson\",\"age\":28,\"email\":\"sam.wilson@example.com\"}" +
                "]";

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonNode jsonArray = objectMapper.readTree(jsonString);

            List<JsonNode> filteredList = new ArrayList<>();
            for (JsonNode node : jsonArray) {
                int age = node.get("age").asInt();
                if (age > 25) {
                    filteredList.add(node);
                }
            }

            System.out.println("Filtered Records (age > 25):");
            for (JsonNode node : filteredList) {
                System.out.println(node.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
