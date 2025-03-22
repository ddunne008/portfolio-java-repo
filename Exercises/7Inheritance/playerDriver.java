import java.util.Scanner;

public class playerDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the player");
        String name = sc.nextLine();
        System.out.println("Enter the team of player");
        String team = sc.nextLine();
        sc.close();

        PlayerStats p = new PlayerStats("Johnathan Wild-man", "SHEFFIELD");
        p.getPlayer();
        p.getTeam();
        p.getScore();
    }
}
