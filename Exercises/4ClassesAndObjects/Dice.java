import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {


        int firstFirstRoll;
        int firstSecondRoll;

        int secondFirstRoll;
        int secondSecondRoll;

        int thirdFirstRoll;
        int thirdSecondRoll;


        int firstTotal;
        int secondTotal;

        float firstAverage;
        float secondAverage;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many sides does Die1 have? ");
        int side1 = scanner.nextInt();

        System.out.println("How many sides does Die2 have? ");
        int side2 = scanner.nextInt();


        firstFirstRoll = (int)(Math.random() * 6);
        firstSecondRoll = (int)(Math.random() * 6);
        System.out.println("Die 1 rolled: " + firstFirstRoll);
        System.out.println("Die 2 rolled: " + firstSecondRoll);

        secondFirstRoll = (int)(Math.random() * 6);
        secondSecondRoll = (int)(Math.random() * 6);
        System.out.println("Die 1 rolled: " + secondFirstRoll);
        System.out.println("Die 2 rolled: " + secondSecondRoll);

        thirdFirstRoll = (int)(Math.random() * 6);
        thirdSecondRoll = (int)(Math.random() * 6);
        System.out.println("Die 1 rolled: " + thirdFirstRoll);
        System.out.println("Die 2 rolled: " + thirdSecondRoll);



        firstTotal = side1 + firstFirstRoll + secondFirstRoll + thirdFirstRoll;
        secondTotal = side2 + firstSecondRoll + secondSecondRoll + thirdSecondRoll;


        firstAverage = side1 + firstFirstRoll + secondFirstRoll + thirdFirstRoll / 3;
        secondAverage = side2 + firstSecondRoll + secondSecondRoll + thirdSecondRoll / 3;

        System.out.println("Die 1 rolled a total of " + firstTotal + " and a Average of " + firstAverage);
        System.out.println("Die 2 rolled a total of " + secondTotal + " and a Average of " + secondAverage);
    }


}
