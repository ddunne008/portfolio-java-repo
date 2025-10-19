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



}
