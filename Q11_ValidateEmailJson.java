package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.main.JsonValidator;
import java.io.File;
import java.io.IOException;

public class Q11_ValidateEmailJson {
    public static void main(String[] args) throws IOException, ProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode schemaNode = objectMapper.readTree(new File("emailschema.json"));
        JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
        JsonSchema schema = factory.getJsonSchema(schemaNode);

        JsonNode jsonData = objectMapper.readTree(new File("emailvalid.json"));

        if (schema.validate(jsonData).isSuccess()) {
            System.out.println("Email field is valid!");
        } else {
            System.out.println("Invalid Email format!");
        }
    }
}