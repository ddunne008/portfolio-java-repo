import java.util.Random;

public class Cards {
    public static Random gen = new Random();
    int spades = 0;
    int hearts = 1;
    int clubs = 2;
    int diamonds = 3;

    int ace = 1;
    int jack = 11;
    int queen = 12;
    int king = 13;

    double suit = (Math.random() * 13) + 1;
    double value = (Math.random() * 13) + 1;
    int e;


    public Cards(int chosenSuit, int chosenValue) {
        suit = chosenSuit;
        value = chosenValue;

    }

    public String Suit() {
        if (suit == 0) {
            return "Spades";
        } else if (suit == 1) {
            return "Hearts";
        } else if (suit == 2) {
            return "Clubs";
        } else if (suit == 3) {
            return "Diamonds";
        } else
            return "error";
    }

    public String Value() {
        if (value == 1.0) {
            return "1";
        } else if (value == 2.0) {
            return "2";
        } else if (value == 3.0) {
            return "3";
        } else if (value == 4.0) {
            return "4";
        } else if (value == 5.0) {
            return "5";
        } else if (value == 6.0) {
            return "6";
        } else if (value == 7.0) {
            return "7";
        } else if (value == 8.0) {
            return "8";
        } else if (value == 9.0) {
            return "9";
        } else if (value == 10.0) {
            return "10";
        } else if (value == 11.0) {
            return "Jack";
        } else if (value == 12.0) {
            return "Queen";
        } else if (value == 13.0) {
            return "King";
        }
        else return "error";
    }
    @Override
    public String toString() {
        return suit + " " + value + " ";
    }
    public static void main(String[] args) {
        for (int e=1; e <= 6; e++) {
            Cards output = new Cards(e % 4, (e % 13) + 1);
            System.out.println("Card " + output.Suit() + " " + output.Value());
        }
    }

}
