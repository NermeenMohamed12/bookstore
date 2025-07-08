package BookStore.Core;

import BookStore.Models.Book;
import java.util.*;

public class Inventory {
    private List<Book> inventory = new ArrayList<>();
    public void addBook(Book book) {
        inventory.add(book);
    }
    public void removeBook(int currentYear, int maxYears) {
        List<Book> toRemove = new ArrayList<>();
        for (Book book : inventory) {
            if (book.isOutdated(currentYear, maxYears)) {
                toRemove.add(book);
            }
        }
        for (Book book : toRemove) {
            inventory.remove(book);
        }
    }
    public double buyBook(String ISBN, int quantity, String email, String address) {
        for (Book book : inventory) {
            if (book.getISBN().equals(ISBN)) {
                if (!book.isAvailable()) {
                    throw new RuntimeException("Book not available.");
                }
                return book.buy(quantity, email, address);
            }
        }
        throw new RuntimeException("Book not found.");
    }
}
