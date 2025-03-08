public class Bulb {
    public Boolean condition;

    Bulb() {

        condition = Boolean.FALSE;

    }

    void turnOn() {
        this.condition = Boolean.TRUE;

    }
    void turnOff() {
        this.condition = Boolean.FALSE;

    }

    Boolean getCondition() {
        return this.condition;
    }
    public class Main {
        public static void main(String[] args) {
            Bulb bulb = new Bulb();
            System.out.println(bulb.getCondition());



        }
    }


}
