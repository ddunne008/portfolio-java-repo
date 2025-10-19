import java.util.Scanner;
import java.text.NumberFormat;

public class Salary {
    public static void main(String[] args) {

        double currentSalary;
        double raise;
        double newSalary;
        String rating;

        raise = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your current salary: ");
        currentSalary = sc.nextDouble();
        System.out.println("Enter your performance rating (Excellent, Good or Poor): ");
        rating = sc.next();

        if (rating.equals("Excellent")) {
            raise = currentSalary * 0.6;

        } else if (rating.equals("Good")) {
            raise = currentSalary * 0.4;
        } else if (rating.equals("Poor")) {
            raise = currentSalary * 0.15;

        }


        newSalary = currentSalary + raise;

        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("Your current Salary is: " + money.format(currentSalary));
        System.out.println("Your Raise is: " + money.format(raise));
        System.out.println("Your new Salary is: " + money.format(newSalary));
        System.out.println();


    }
}
