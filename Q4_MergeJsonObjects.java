package org.example;

import org.json.JSONObject;

public class Q4_MergeJsonObjects {
    public static void main(String[] args) {
        try {

            JSONObject jsonObject1 = new JSONObject();
            jsonObject1.put("name", "John Doe");
            jsonObject1.put("age", 20);

            JSONObject jsonObject2 = new JSONObject();
            jsonObject2.put("email", "john.doe@example.com");
            jsonObject2.put("address", "123 Main St");

            for (String key : jsonObject2.keySet()) {
                jsonObject1.put(key, jsonObject2.get(key));
            }

            System.out.println(jsonObject1.toString(2));

        } catch (Exception e) {
            System.err.println("Error merging JSON objects: " + e.getMessage());
        }
    }
}
