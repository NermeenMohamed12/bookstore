package BookStore.Services;

import BookStore.Models.EBook;

public class MailService {
    public static void send(EBook book, String email) {
        System.out.println("Sending ebook '" + book.getTitle() + "' to " + email);
    }
}
