import java.util.Scanner;

public class SquareCalc {
    public static void main(String[] args) {


        int square_side;
        int square_perimeter;

        System.out.print("Enter a square side: ");
        Scanner scan = new Scanner(System.in);
        square_side = scan.nextInt();
        square_perimeter = square_side * 4;

        System.out.println("The square perimeter total is: " + square_perimeter + "cm");
        System.out.println("The area total is: " + square_perimeter * square_side + "cm");
    }
}
