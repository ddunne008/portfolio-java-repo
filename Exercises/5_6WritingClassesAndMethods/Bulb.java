public class Bulb {
    private Boolean condition;

    Bulb() {

        condition = false;

    }

    void turnOn() {
        this.condition = true;

    }

    void turnOff() {
        this.condition = false;

    }

    Boolean getCondition() {
        return this.condition;
    }


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
