public class ClassAndObjectTest {
    public static void main(String[] args) {

        String string1 = "Hello World";
        String string2 = new String("Hello World");
        String string3 = "Leeds Beckett University";
        System.out.println(System.identityHashCode(string1));
        String newString = string1.concat(string2).toUpperCase();

    }
}
