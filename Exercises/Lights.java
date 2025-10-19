public class Lights {
    public static void main(String[] args) {

        Bulb bulb = new Bulb();
        System.out.println(bulb.getCondition());
        System.out.println("Current condition:" + bulb.getCondition());
        bulb.turnOn();
        System.out.println("When turned on: " + bulb.getCondition());
        bulb.turnOff();
        System.out.println("When turned off: " + bulb.getCondition());
        
    }
}