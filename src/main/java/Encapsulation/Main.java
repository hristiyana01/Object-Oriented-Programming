package Encapsulation;

public class Main {
    public static void main(String[] args) {
        User educative = new User("Educative", "12345");
        educative.login("Educative","12345");
        educative.login("Educative", "3456"); //Does not grant access because the credentials are invalid

//        educative.password = "3456"; //OOPS SOMEONE ACCESSED THE PASSWORD FIELD
//
//        educative.login("Educative", "3456"); // GRANTS ACCESS BUT THIS SHOULD NOT HAVE HAPPENED!
        }
}
