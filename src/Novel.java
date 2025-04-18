public class Novel extends Book {
    private String genre;
    private boolean isFiction;

    public Novel(String title, String author, String genre, boolean isFiction) {
        super(title, author); // calling parent constructor
        this.genre = genre;
        this.isFiction = isFiction;
    }

    public String getGenre() {
        return genre;
    }


    public void displayInfo() {
        super.displayInfo(); // reuse parent method
        System.out.println("Genre: " + genre);
        System.out.println("Is Fiction: " + isFiction);
    }

    public void printSummary() {
        System.out.println(getTitle() + " is a " + genre + " novel by " + getAuthor() + ".");
    }

    public static void main(String[] args) {
        Book[] library = {
                new Book("Rich Dad Poor Dad", "Robert Kiyosaki"),
                new Novel("1984", "George Orwell", "Dystopian", true),
                new Novel("Harry Potter", "J.K. Rowling", "Fantasy", true)
        };

        for (Book b : library) {
            b.printSummary(); // Each will call the correct version!
            System.out.println("--------------");
        }

    }

}
