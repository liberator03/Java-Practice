import java.sql.SQLOutput;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public void setAuthor(String author){
        this.author=author;
    }

    public void displayInfo(){
        System.out.println("Title of the Book : "+title);
        System.out.println("Author of the Book : "+author);
        System.out.println();
    }

    public static void main(String[] args) {
        Book book = new Book("Atomic Habits", "James Clear");
//        Book book2 = new Book("Wings of Fire", "A. P. J. Abdul Kalam");

//        book1.title = "Monk who sold his Ferrari.";
//        book1.author = "Robin Sharma";
//        book2.title = "Kala Paani.";
//        book2.author = "Swatantraveer Sawarkar";

        book.displayInfo();

        book.setTitle("Deep Work");
        book.setAuthor("Cal Newport");
        System.out.println("After Update of Book :");
        book.displayInfo();

        System.out.println("Author name found : "+ book.getTitle());
    }
}
