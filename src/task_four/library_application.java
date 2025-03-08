package task_four;
import java.util.Scanner; 
class Books {
    private String title;
    private String author;
    private int pages;
    public Books(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPages() { return pages; }
    public void displayDetails() {
        System.out.println("📚 Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}
class EBooks extends Books {
    private double fileSize;  
    public EBooks(String title, String author, int pages, double fileSize) {
        super(title, author, pages); 
        this.fileSize = fileSize;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("File Size: " + fileSize + " MB");
    }
}
class audio extends Books{
    private double duration;  
    public audio(String title, String author, int pages, double duration) {
        super(title, author, pages);
        this.duration = duration;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Audio Duration: " + duration + " hours");
    }
}
public class library_application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine();
        System.out.print("Enter Number of Pages: ");
        int pages = scanner.nextInt();
        Books book1 = new Books(title, author, pages);
        System.out.println("\n");
        book1.displayDetails();
        EBooks ebook1 = new EBooks("Java Programming", "James Gosling", 500, 2.5);
        System.out.println("\n");
        ebook1.displayDetails();
        audio audiobook1 = new audio("Rich Dad Poor Dad", "Robert Kiyosaki", 150, 5.5);
        System.out.println("\n");
        audiobook1.displayDetails();
        scanner.close();
    }
}
