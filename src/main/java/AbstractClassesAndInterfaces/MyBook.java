package AbstractClassesAndInterfaces;

public class MyBook extends Book{
    public MyBook(String name, String author, double price) {
        super(name, author, price);
    }

    @Override
    void getDetails() {
        System.out.println("My book name is: " + name);
        System.out.println("Which author is: " + author);
        System.out.println("The price is: " + price);
    }
}
