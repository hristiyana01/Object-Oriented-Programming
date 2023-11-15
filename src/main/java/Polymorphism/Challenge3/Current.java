package Polymorphism.Challenge3;

public class Current extends Account{
    public Current(double balance) {
        super(50000);

    }
    @Override
    public void Withdraw(double amount) {
        balance -= amount;
        //super.Withdraw(amount);
    }

    @Override
    public void Deposit(double amount) {
        balance += amount;
        //super.Deposit(amount);
    }

    @Override
    public void printBalance() {
        System.out.println("Balance in your current account: " + balance);
        //super.printBalance();
    }
}
