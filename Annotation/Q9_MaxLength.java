import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

class User {
    @MaxLength(10)
    private String username;

    public User(String username) {
        Field field;
        try {
            field = this.getClass().getDeclaredField("username");
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength maxLength = field.getAnnotation(MaxLength.class);
                int maxLengthValue = maxLength.value();

                if (username.length() > maxLengthValue) {
                    throw new IllegalArgumentException("Username exceeds the maximum length of " + maxLengthValue);
                }
            }
            this.username = username;
        } catch (NoSuchFieldException | SecurityException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }
}

public class Q9_MaxLength {
    public static void main(String[] args) {
        try {
            User user1 = new User("LongUserName");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            User user2 = new User("ShortUser");
            System.out.println("User2 created with username: " + user2.getUsername());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
