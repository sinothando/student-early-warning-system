package creational_patterns;

import model.Student;

public class UserFactory {

    public static Object createUser(String role) {
        if (role.equalsIgnoreCase("student")) {
            return new Student("1", "Sino", "Active");
        } else {
            throw new IllegalArgumentException("Invalid role");
        }
    }
}