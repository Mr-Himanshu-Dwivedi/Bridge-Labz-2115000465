import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

@Author(name = "Baby John")
class Book {}

public class Q6_RetrieveAnnotation {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Book.class;

        if (cls.isAnnotationPresent(Author.class)) {
            Author author = cls.getAnnotation(Author.class);
            System.out.println("Author: " + author.name());
        } else {
            System.out.println("No Author annotation present.");
        }
    }
}
