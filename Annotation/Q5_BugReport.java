import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

class BugTracker {
    @BugReport(description = "Null pointer exception in method X")
    @BugReport(description = "Out of memory error in method X")
    public void methodWithBugs() {
        System.out.println("Method with bugs.");
    }
}

public class Q5_BugReport {
    public static void main(String[] args) throws Exception {
        BugTracker tracker = new BugTracker();
        Method method = tracker.getClass().getMethod("methodWithBugs");

        if (method.isAnnotationPresent(BugReports.class)) {
            BugReports bugReports = method.getAnnotation(BugReports.class);
            for (BugReport bugReport : bugReports.value()) {
                System.out.println("Bug Report: " + bugReport.description());
            }
        }
    }
}
