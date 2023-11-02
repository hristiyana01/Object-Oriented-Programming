package Encapsulation;

public class User {

    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void login(String userName, String password) {
        if (this.userName.equalsIgnoreCase(userName) && this.password.equals(password)) {
            System.out.println("Access Granted against the username: " + this.userName + " and password: " + this.password);
        } else System.out.println("Invalid credentials!");
    }
}
