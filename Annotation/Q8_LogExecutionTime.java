import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {
}

class TaskExecutor {
    @LogExecutionTime
    public void task1() {
        try {
            Thread.sleep(1000);
            System.out.println("Task 1 completed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @LogExecutionTime
    public void task2() {
        try {
            Thread.sleep(500);
            System.out.println("Task 2 completed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @LogExecutionTime
    public void task3() {
        try {
            Thread.sleep(2000);
            System.out.println("Task 3 completed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Q8_LogExecutionTime {
    public static void main(String[] args) {
        try {
            TaskExecutor executor = new TaskExecutor();
            Method[] methods = executor.getClass().getMethods();

            for (Method method : methods) {
                if (method.isAnnotationPresent(LogExecutionTime.class)) {
                    long startTime = System.nanoTime();

                    method.invoke(executor);

                    long endTime = System.nanoTime();
                    long duration = endTime - startTime;
                    System.out.println("Execution time of " + method.getName() + ": " + duration + " nanoseconds\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
