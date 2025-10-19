
public class Transactions {
    public static void main(String[] args) {

        Account account_1 = new Account ("Daniel Dunne", 14832, 28.98);
        Account account_2 = new Account ("John Doe", 26810, 89.44);
        Account account_3 = new Account ("Mina Alexander", 12345, 48.21);

        account_1.deposit(100.00);
        double smithBalance = account_2.deposit(50.88);

        System.out.println("Daniel's balance after withdrawal: " + smithBalance);
        System.out.println("Daniel's balance before withdrawal: " + account_1);

        account_1.addInterest();
        account_2.addInterest();
        account_3.addInterest();

        System.out.println(account_1);
        System.out.println(account_2);
        System.out.println(account_3);
    }
}
