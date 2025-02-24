import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

class Q11_CustomSerialization {

    static class User {
        @JsonField(name = "user_name")
        private String username;

        @JsonField(name = "user_age")
        private int age;

        @JsonField(name = "user_email")
        private String email;

        public User(String username, int age, String email) {
            this.username = username;
            this.age = age;
            this.email = email;
        }
    }

    public static String toJson(Object obj) throws IllegalAccessException {
        StringBuilder json = new StringBuilder("{");
        Field[] fields = obj.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField jsonField = field.getAnnotation(JsonField.class);
                field.setAccessible(true);
                if (i > 0) json.append(", ");
                json.append("\"").append(jsonField.name()).append("\": \"").append(field.get(obj)).append("\"");
            }
        }
        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) throws IllegalAccessException {
        User user = new User("Himanshu", 21, "himanshu@gmail.com");
        String json = toJson(user);
        System.out.println(json);
    }
}
