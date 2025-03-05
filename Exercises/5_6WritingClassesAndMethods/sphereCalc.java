import java.util.Scanner;

public class sphereCalc {

    double diameter;

    // Constructor
    sphereCalc(double d) {
        diameter = d;
    }

    // Getter for diameter
    double getDiameter() {
        return diameter;
    }

    // Method to calculate surface area
    double getSurfaceArea() {
        double radius = diameter / 2;
        return 4 * 3.14 * radius * radius; // Use Math.PI instead of 3.14
    }

    // Method to calculate volume
    double getVolume() {
        double radius = diameter / 2;
        return (4/3) * 3.14 * radius * radius * radius; // Fix integer division
    }

    // Overriding toString()
    @Override
    public String toString() {
        return "Sphere Diameter: " + getDiameter() +
                ",Surface Area: " + getSurfaceArea() +
                ",Volume: " + getVolume();
    }

    // Main method
    public static void main(String[] args) {
        sphereCalc sphere = new sphereCalc(10);
        System.out.println(sphere);
    }
}
