import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {

        short radius;
        int rad3;
        int rad2;
        double surfArea;
        double volume;

        System.out.print("Enter radius: ");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextShort();

        rad3 = radius * radius * radius;
        volume = 4 * 3.14 * rad3 / 3;


        rad2 = radius * radius;
        surfArea = 4 * 3.14 * rad2;

        System.out.println("The Volume of the sphere is " + volume);
        System.out.println("The Surface area of the sphere is " + surfArea);

    }
}
