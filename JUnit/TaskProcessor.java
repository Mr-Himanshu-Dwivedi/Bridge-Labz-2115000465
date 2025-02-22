//TaskProcessor.java
package JUnit;

public class TaskProcessor {
    public static String longRunningTask() throws InterruptedException {
        Thread.sleep(1000);
        return "Task Completed";
    }
}
