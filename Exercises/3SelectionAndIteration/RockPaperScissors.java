import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {

        String personPlay;
        String computerPlay = "";
        int computerInt;


        Scanner sc = new Scanner(System.in);
        Random generator = new Random();
        System.out.println("Chose your option, Rock, Paper or Scissors in the specified format (E.g. Paper = P) ");
        personPlay = sc.nextLine();


        computerInt = generator.nextInt(0, 2);

        switch (computerInt) {
            case 0:
                computerPlay = "R"; //Rock
                break;
            case 1:
                computerPlay = "S"; //Scissors
                break;
            case 2:
                computerPlay = "P"; //Paper
                break;

        }

        System.out.println("Computer Play: " + computerPlay);
        if (personPlay.equals(computerPlay))
            System.out.println("Its a tie!");
        if (personPlay.equals("R"))
            if (computerPlay.equals("S"))
                System.out.println("Rock beats Scissors, You win!");


        else if (personPlay.equals("S"))
            if (computerPlay.equals("R"))
                System.out.println("Rock beats scissors, You lose!");
        if (personPlay.equals("S"))
            if (computerPlay.equals("P"))
                System.out.println("Scissors beats Paper, You win!");
        else if (personPlay.equals("P"))
            if (computerPlay.equals("S"))
                System.out.println("Scissors beats Paper, You Lose");
        if (personPlay.equals("P"))
            if (computerPlay.equals("R"))
                System.out.println("Paper beats Rock, You win!");
        else if (personPlay.equals("R"))
            if (computerPlay.equals("P"))
                System.out.println("Paper beats rock, You lose!");

    }
}
