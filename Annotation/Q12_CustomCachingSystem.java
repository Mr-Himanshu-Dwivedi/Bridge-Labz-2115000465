import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {
}

class Q12_CustomCachingSystem {

    private static Map<String, Object> cache = new HashMap<>();

    @CacheResult
    public int expensiveComputation(int input) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return input * input;
    }

    public Object cacheMethodResult(Method method, Object[] args) throws Exception {
        if (method.isAnnotationPresent(CacheResult.class)) {
            String cacheKey = method.getName() + Arrays.toString(args);
            if (cache.containsKey(cacheKey)) {
                return cache.get(cacheKey);
            }
            Object result = method.invoke(this, args);
            cache.put(cacheKey, result);
            return result;
        }
        return method.invoke(this, args);
    }

    public static void main(String[] args) throws Exception {
        Q12_CustomCachingSystem obj = new Q12_CustomCachingSystem();
        Method method = obj.getClass().getDeclaredMethod("expensiveComputation", int.class);

        System.out.println("First call with input 5:");
        System.out.println("Result: " + obj.cacheMethodResult(method, new Object[]{5}));

        System.out.println("\nSecond call with input 5 (should use cache):");
        System.out.println("Result: " + obj.cacheMethodResult(method, new Object[]{5}));

        System.out.println("\nCall with input 10:");
        System.out.println("Result: " + obj.cacheMethodResult(method, new Object[]{10}));
    }
}
