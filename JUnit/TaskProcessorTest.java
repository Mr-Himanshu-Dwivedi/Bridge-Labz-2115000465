//TaskProcessorTest.java
package JUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

public class TaskProcessorTest {

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    public void testLongRunningTask() throws InterruptedException {
        assertEquals("Task Completed", TaskProcessor.longRunningTask());
    }
}
