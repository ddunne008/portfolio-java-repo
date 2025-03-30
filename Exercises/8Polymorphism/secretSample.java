public class secretSample {
    public static void main(String[] args) {

        Secret secret = new Secret("You cant crack this!");

        System.out.println("The secret word is: " + secret);

        System.out.println(secret.encrypt());
        System.out.println(secret.decrypt());


    }
}
