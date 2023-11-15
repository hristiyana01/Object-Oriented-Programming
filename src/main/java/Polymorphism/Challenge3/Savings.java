package Polymorphism.Challenge3;

public class Savings extends Account{
    private double interestRate = 0.8;
    public Savings(double balance) {
        super(50000);

    }
    @Override
    public void Withdraw(double amount) {
        balance -= amount + (amount * interestRate);
        //super.Withdraw(amount);
    }

    @Override
    public void Deposit(double amount) {
        balance += amount + (amount * interestRate);
        //super.Deposit(amount);
    }

    @Override
    public void printBalance() {
        System.out.println("Balance in your saving account: " + balance);
        //super.printBalance();
    }
}
