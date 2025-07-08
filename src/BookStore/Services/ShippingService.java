package BookStore.Services;

import BookStore.Models.PaperBook;

public class ShippingService {
    public static void send(PaperBook book, String address) {
        System.out.println("Shipping paper book '" + book.getTitle() + "' to " + address);
    }
}
