import java.util.Scanner;

public class playerDriver {
    public static void main(String[] args) {

        PlayerStats p1 = new PlayerStats("Johnathan Wild-man", "SHEFFIELD", 5, "Football");
        PlayerStats pl1 = new PlayerStats("Johnathan Wild-man", "SHEFFIELD", 3, "Cricket" );
        PlayerStats p2 = new PlayerStats("Max Wilson", "LEEDS", 7, "Netball");
        PlayerStats p3 = new PlayerStats("Gerald Green", "NEWCASTLE", 2, "Basketball");
        PlayerStats pl3 = new PlayerStats("Gerald Green", "NEWCASTLE", 6, "Football");


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the team of player");
        String team = sc.nextLine();
        System.out.println("Enter the name of the player");
        String name = sc.nextLine();



        System.out.println(p1);
        System.out.println(pl1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(pl3);

        System.out.println("Stats for player " + name);
        if (name.equals("Johnathan Wild-man")) {
            System.out.println(pl1);
        } else if (name.equals("Gerald Green")) {
            System.out.println(pl3);
        } else {
            System.out.println("No player was found");

            sc.close();
        }










    }
}
