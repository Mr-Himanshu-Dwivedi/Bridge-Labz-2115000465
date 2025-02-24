package Reflection;

import java.lang.reflect.*;
import java.util.Scanner;

public class Q1_GetClassInformation {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter class name: ");
        String className = scanner.nextLine();

        try {
            Class<?> cls = Class.forName(className);

            System.out.println("Methods:");
            for (Method method : cls.getDeclaredMethods()) {
                System.out.println(method.getName());
            }

            System.out.println("\nFields:");
            for (Field field : cls.getDeclaredFields()) {
                System.out.println(field.getName());
            }

            System.out.println("\nConstructors:");
            for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
                System.out.println(constructor.getName());
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
        }
    }
}

//For example Enter java.util.ArrayList
