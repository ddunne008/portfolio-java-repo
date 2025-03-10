import java.util.Scanner;

public class BookShelf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter tittle: ");
        String tittle = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        System.out.print("Enter publisher: ");
        String publisher = sc.nextLine();
        System.out.print("Enter copyright date: ");
        String copyRightDate = sc.nextLine();




        sc.close();
        Book BookDetails = new Book(tittle, author, publisher, copyRightDate);
        System.out.println(BookDetails);

    }
}