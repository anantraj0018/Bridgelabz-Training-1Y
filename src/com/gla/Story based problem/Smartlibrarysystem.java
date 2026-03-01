// Parent Class
class Book {
    
    protected int bookId;
    protected String title;
    protected double price;
    
    // Static variable shared across all books
    static String libraryName = "City Central Library";
    
    // Constructor
    public Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }
    
    // Method to calculate fine (default implementation)
    public double calculateFine(int daysLate) {
        return 0; // Will be overridden
    }
    
    public void displayInfo() {
        System.out.println("Library: " + libraryName);
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Price: ₹" + price);
    }
}


// Child Class 1
class TextBook extends Book {
    
    public TextBook(int bookId, String title, double price) {
        super(bookId, title, price);
    }
    
    // Overriding calculateFine()
    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 2; // ₹2 per day
    }
}


// Child Class 2
class Magazine extends Book {
    
    public Magazine(int bookId, String title, double price) {
        super(bookId, title, price);
    }
    
    // Overriding calculateFine()
    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 5; // ₹5 per day
    }
}


// Main Class
public class SmartLibrarySystem {
    
    public static void main(String[] args) {
        
        // Polymorphism (Parent reference)
        Book book1 = new TextBook(101, "Java Programming", 450);
        Book book2 = new Magazine(202, "Tech Monthly", 150);
        
        int daysLate = 3;
        
        book1.displayInfo();
        System.out.println("Fine: ₹" + book1.calculateFine(daysLate));
        
        System.out.println("--------------------------");
        
        book2.displayInfo();
        System.out.println("Fine: ₹" + book2.calculateFine(daysLate));
    }
}