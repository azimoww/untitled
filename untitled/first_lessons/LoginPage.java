package untitled.first_lessons;

import nadir_deskop.homework.User;

public class LoginPage {
    public static void main(String[] args) {
        User u = new User();

        u.setUsername("nadir12345");
        u.setPassword("12345");
        u.setAge(15);

        System.out.println("Username: " + u.getUsername());
        System.out.println("---------------");
        System.out.println("Password: " + u.getPassword());
        System.out.println("Age: " + u.getAge());
    }
}