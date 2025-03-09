import java.util.Scanner;

public class Book {
    String tittle;
    String author;
    String publisher;
    int copyRightDate;

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Author").append(author);
        output.append("Title").append(tittle);
        output.append("Publisher").append(publisher);
        output.append("Copyright Date").append(copyRightDate);
        return output.toString();
    }

    public static class BookInfo {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Book BookDetails = new Book();

            System.out.print("Enter tittle: ");
            BookDetails.tittle = sc.nextLine();
            System.out.print("Enter author: ");
            BookDetails.author = sc.nextLine();
            System.out.print("Enter publisher: ");
            BookDetails.publisher = sc.nextLine();

            sc.close();


            System.out.println(BookDetails);
        }
    }
}
