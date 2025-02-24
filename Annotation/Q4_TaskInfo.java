import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
    int priority();
    String assignedTo();
}

class TaskManager {
    @TaskInfo(priority = 1, assignedTo = "John Doe")
    public void task1() {
        System.out.println("Task 1 is being executed.");
    }
}

public class Q4_TaskInfo {
    public static void main(String[] args) throws Exception {
        TaskManager manager = new TaskManager();
        Method method = manager.getClass().getMethod("task1");

        if (method.isAnnotationPresent(TaskInfo.class)) {
            TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
            System.out.println("Task Priority: " + taskInfo.priority());
            System.out.println("Assigned To: " + taskInfo.assignedTo());
        }
    }
}
