import java.lang.reflect.*;

class Configuration {
    private static String API_KEY = "original_key";

    public static String getApiKey() {
        return API_KEY;
    }
}

public class Q7_AccessModifyStatic {
    public static void main(String[] args) throws Exception {
        Field field = Configuration.class.getDeclaredField("API_KEY");
        field.setAccessible(true);

        System.out.println("Original API_KEY: " + Configuration.getApiKey());

        field.set(null, "new_api_key");
        System.out.println("Modified API_KEY: " + Configuration.getApiKey());
    }
}
