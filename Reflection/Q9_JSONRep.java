import java.lang.reflect.*;
import java.util.*;

class CustomJsonConverter {
    public static String toJson(Object obj) throws IllegalAccessException {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{");

        Field[] fields = obj.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            jsonBuilder.append("\"").append(fields[i].getName()).append("\": \"").append(fields[i].get(obj)).append("\"");

            if (i < fields.length - 1) {
                jsonBuilder.append(", ");
            }
        }

        jsonBuilder.append("}");
        return jsonBuilder.toString();
    }
}

class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Q9_JSONRep {
    public static void main(String[] args) throws IllegalAccessException {
        People dynamicObject = new People("Oggy", 301);
        String json = CustomJsonConverter.toJson(dynamicObject);
        System.out.println("JSON Representation: " + json);
    }
}
