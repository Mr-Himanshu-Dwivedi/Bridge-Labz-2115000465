import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

class Q10_RoleBasedAccessControl {

    @RoleAllowed("ADMIN")
    public void adminMethod() {
        System.out.println("Admin method accessed!");
    }

    public void validateAccess(String role, String methodName) throws Exception {
        Method method = getClass().getDeclaredMethod(methodName);
        if (method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
            if (!roleAllowed.value().equals(role)) {
                System.out.println("Access Denied!");
                return;
            }
        }
        method.invoke(this);
    }

    public static void main(String[] args) throws Exception {
        Q10_RoleBasedAccessControl obj = new Q10_RoleBasedAccessControl();

        String roleAdmin = "ADMIN";
        String roleUser = "USER";

        System.out.println("ADMIN role:");
        obj.validateAccess(roleAdmin, "adminMethod");

        System.out.println("\nUSER role:");
        obj.validateAccess(roleUser, "adminMethod");
    }
}
