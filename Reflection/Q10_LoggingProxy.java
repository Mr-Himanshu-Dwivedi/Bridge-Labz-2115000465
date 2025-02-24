import java.lang.reflect.*;

interface Greeting {
    void sayHello();
    void sayGoodbye();
}

class GreetingImpl implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Hello, world!");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Goodbye, world!");
    }
}

class LoggingProxy implements InvocationHandler {
    private final Object target;

    public LoggingProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Logging: Method " + method.getName() + " is being called");
        return method.invoke(target, args);
    }
}

public class Q10_LoggingProxy {
    public static void main(String[] args) {
        Greeting greeting = new GreetingImpl();
        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class<?>[]{Greeting.class},
                new LoggingProxy(greeting)
        );

        proxy.sayHello();
        proxy.sayGoodbye();
    }
}
