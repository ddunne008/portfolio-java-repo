
public class Sphere {

    private int sphereRadius, sphereDiameter;
    double sphereVolume, sphereSurfArea;
    double CalcVolume;
    double surfArea;
    int a;

    String SphereDiameter, SphereSurfArea, SphereVolume;


    public void setDiameter(int diam) {
        if (diam > sphereDiameter) {
            sphereDiameter = diam;
        }
    }

    public int CalcRadius () {
        sphereRadius = sphereDiameter / 2;
        return sphereRadius;
    }


    public double CalcVolume() {
        sphereVolume = sphereDiameter * sphereRadius;
        return sphereVolume;
    }

    public double CalcSurfArea(int radius) {
        a = CalcRadius() * sphereRadius;
        surfArea = 4 * 3.14;
        return surfArea;
    }

    public String Display() {
        SphereDiameter = Integer.toString(sphereDiameter);
        SphereVolume = Double.toString(CalcVolume);
        SphereSurfArea = Double.toString(surfArea);
        return SphereDiameter + SphereVolume + SphereSurfArea;

    }

    public void SphereOverall() {


        System.out.println("The overall Diameter of the Sphere is: " + SphereDiameter);
        System.out.println("The Overall Volume of the Sphere is: " + SphereVolume);
        System.out.println("The overall Surf Area of the Sphere is: " + SphereSurfArea);



    }
}



