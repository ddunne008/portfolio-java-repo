public class sphereCalc {

    double diameter;

    sphereCalc(double d) {
        diameter = d;
    }

    double getDiameter() {
        return diameter;
    }

    double getSurfaceArea() {
        double radius = diameter / 2;
        return 4 * 3.14 * radius * radius; // Use Math.PI instead of 3.14
    }

    double getVolume() {
        double radius = diameter / 2;
        return (4/3) * 3.14 * radius * radius * radius; // Fix integer division
    }

    @Override
    public String toString() {
        return "Sphere Diameter: " + getDiameter() + "Surface Area: " + getSurfaceArea() + "Volume: " + getVolume();
    }

    public static void main(String[] args) {
        sphereCalc sphere = new sphereCalc(10);
        System.out.println(sphere);
    }
}
