import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}

class Task {
    @ImportantMethod(level = "LOW")
    public void task1() {
        System.out.println("Executing Task 1");
    }

    @ImportantMethod
    public void task2() {
        System.out.println("Executing Task 2");
    }

    public void task3() {
        System.out.println("Executing Task 3");
    }
}

public class Q6_ImportantMethod {
    public static void main(String[] args) throws Exception {
        Task manager = new Task();
        Method[] methods = manager.getClass().getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + ", Importance Level: " + annotation.level());
            }
        }
    }
}
