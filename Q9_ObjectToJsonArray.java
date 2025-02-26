package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Q9_ObjectToJsonArray {

    public static class Car {
        private String make;
        private String model;
        private int year;

        public Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", "Corolla", 2020));
        carList.add(new Car("Honda", "Civic", 2022));
        carList.add(new Car("Ford", "Mustang", 2021));

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Convert the list of Car objects into a JSON array
            String jsonArray = objectMapper.writeValueAsString(carList);

            // Print the resulting JSON array
            System.out.println(jsonArray);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
