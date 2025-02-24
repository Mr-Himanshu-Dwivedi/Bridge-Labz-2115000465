import java.lang.reflect.*;
import java.util.Map;

class ObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        T instance = clazz.getDeclaredConstructor().newInstance();

        for (Map.Entry<String, Object> entry : properties.entrySet()) {
            try {
                Field field = clazz.getDeclaredField(entry.getKey());
                field.setAccessible(true);
                field.set(instance, entry.getValue());
            } catch (NoSuchFieldException e) {
                System.out.println("No such field: " + entry.getKey());
            }
        }
        return instance;
    }
}

class DynamicClass {
    private String name;
    private int age;

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Q8_CustomObjectMapper {
    public static void main(String[] args) throws Exception {
        Map<String, Object> properties = Map.of(
                "name", "Oggy And Cockroaches",
                "age", 301
        );
        DynamicClass dynamicObject = ObjectMapper.toObject(DynamicClass.class, properties);
        dynamicObject.display();
    }
}
