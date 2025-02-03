import java.util.Scanner;

public class TableOfStudents {
    public static void main(String[] args) {

        int Lab;
        int Bonus;
        int Total;

        System.out.println("//////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("       Student Points  ");
        System.out.println("//////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

        System.out.printf("%-10s %-5s %-5s %-5s %n", "Name", "Lab", "Bonus", "Total");
        System.out.printf("%-10s %-5s %-5s %-5s %n", "----", "---", "-----", "-----");

        System.out.printf("%-10s %-5s %-5s %-5s %n", "Joe", "20", "4", 24 );
        System.out.printf("%-10s %-5s %-5s %-5s %n", "Nathan", "18", "2", 20);
        System.out.printf("%-10s %-5s %-5s %-5s %n", "Daisy", "13", "6", 19);
        System.out.printf("%-10s %-5s %-5s %-5s %n", "Alex", "24", "1", 25);
        System.out.printf("%-10s %-5s %-5s %-5s %n", "Thomas", "11", "5", 16);
    }
}
