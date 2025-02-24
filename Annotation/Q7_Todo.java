import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class ProjectManager {
    @Todo(task = "Implement login feature", assignedTo = "Himanshu", priority = "HIGH")
    public void task1() {
        System.out.println("Task 1 is being worked on.");
    }

    @Todo(task = "Create user profile page", assignedTo = "Him")
    public void task2() {
        System.out.println("Task 2 is being worked on.");
    }

    @Todo(task = "Write unit tests for login", assignedTo = "Anshu", priority = "LOW")
    public void task3() {
        System.out.println("Task 3 is being worked on.");
    }
}

public class Q7_Todo {
    public static void main(String[] args) throws Exception {
        ProjectManager manager = new ProjectManager();
        Method[] methods = manager.getClass().getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Task: " + todo.task());
                System.out.println("Assigned To: " + todo.assignedTo());
                System.out.println("Priority: " + todo.priority());
                System.out.println();
            }
        }
    }
}
