import java.util.Scanner;


public class Book {
    String tittle;
    String author;
    String publisher;
    int copyRightDate;
    String output;

    @Override
    public String toString() {
        output += ("Author" + author);
        output += ("Title" + tittle);
        output += ("Publisher" + publisher);
        output += ("Copyright Date" + copyRightDate);
        return output;
    }

    public class BookInfo {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter title: ");
            String title = sc.nextLine();
            System.out.print("Enter author: ");
            String author = sc.nextLine();
            System.out.print("Enter publisher: ");

            Book BookDetails = new Book();
            System.out.println(BookDetails);
        }
    }
}