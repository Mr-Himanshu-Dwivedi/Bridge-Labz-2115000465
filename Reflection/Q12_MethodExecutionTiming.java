import java.lang.reflect.*;

class MethodExecutionTimer {
    public static void measureExecutionTime(Object obj, String methodName, Class<?>[] paramTypes, Object[] params) throws Exception {
        Method method = obj.getClass().getDeclaredMethod(methodName, paramTypes);
        long startTime = System.nanoTime();
        method.setAccessible(true);
        method.invoke(obj, params);
        long endTime = System.nanoTime();
        System.out.println("Execution time: " + (endTime - startTime) + " nanoseconds");
    }
}

class TestClass {
    public void sampleMethod() {
        try {
            Thread.sleep(1000);  // Sleep for 1 second
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class Q12_MethodExecutionTiming {
    public static void main(String[] args) throws Exception {
        TestClass testClass = new TestClass();
        MethodExecutionTimer.measureExecutionTime(testClass, "sampleMethod", new Class<?>[]{}, new Object[]{});
    }
}
