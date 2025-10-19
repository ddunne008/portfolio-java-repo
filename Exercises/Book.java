public class Book {
    private String tittle;
    private String author;
    private String publisher;
    private String copyRightDate;



    public Book(String tittle, String author, String publisher, String copyRightDate) {
        this.tittle = tittle;
        this.author = author;
        this.publisher = publisher;
        this.copyRightDate = copyRightDate;

    }

    public String getTittle() {
        return tittle;

    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;

    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;

    }

    public String getCopyRightDate() {
        return copyRightDate;

    }

    public void setCopyRightDate(String copyRightDate) {
        this.copyRightDate = copyRightDate;
    }

    @Override
    public String toString() {
        return "Book Information: " + tittle + ", " + author + ", " + publisher + ", " + copyRightDate;
    }

}