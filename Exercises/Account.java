import java.text.NumberFormat;
public class Account {
    private final double RATE = 0.035;
    private String name;
    private long accountNumber;
    private double balance;
    private double initial;
    private long account;
    private String owner;

    public Account(String name, long accountNumber, double balance) {
        this.name = owner;
        this.accountNumber = account;
        this.balance = initial;

    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;


        }
        return balance;
    }

    public double withdraw(double amount, double fee) {
        if (amount + fee > 0 && amount + fee < balance);
        balance = balance - amount - fee;

        return balance;
    }

    public double addInterest() {
        balance += (balance * RATE);
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        return (accountNumber + name + formatter.format(balance));
    }
}
