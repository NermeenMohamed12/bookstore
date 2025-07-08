package BookStore.Models;

public abstract class Book {
    protected String ISBN;
    protected String title;
    protected int publishedYear;
    protected double price;
    public Book(String ISBN, String title, int publishedYear, double price){
        this.ISBN = ISBN;
        this.title = title;
        this.publishedYear = publishedYear;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public double getPrice() {
        return price;
    }
    public abstract double buy(int quantity, String email, String address );
    public abstract boolean isAvailable();
    public abstract boolean isOutdated(int currentYear, int maxYears);
}
