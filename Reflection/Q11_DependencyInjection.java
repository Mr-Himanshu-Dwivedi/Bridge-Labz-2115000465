import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@interface Inject {}

class Service {
    public void serve() {
        System.out.println("Service is working");
    }
}

class Client {
    @Inject
    private Service service;

    public void execute() {
        service.serve();
    }
}

class DIContainer {
    private final Map<Class<?>, Object> services = new HashMap<>();

    public void register(Class<?> clazz) throws Exception {
        Object instance = clazz.getDeclaredConstructor().newInstance();
        services.put(clazz, instance);
    }

    public void inject(Object obj) throws IllegalAccessException {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                field.set(obj, services.get(field.getType()));
            }
        }
    }
}

public class Q11_DependencyInjection {
    public static void main(String[] args) throws Exception {
        DIContainer container = new DIContainer();
        container.register(Service.class);
        container.register(Client.class);

        Client client = new Client();
        container.inject(client);

        client.execute();  // Should call Service's serve method
    }
}
