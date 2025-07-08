package BookStore;

import BookStore.Models.*;
import BookStore.Core.Inventory;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();


        PaperBook paperBook = new PaperBook("6", "Java ", 2018, 200, 10);
        EBook eBook = new EBook("3", "OOP", 2020, 100, "PDF");
        ShowcaseBook showcaseBookBook = new ShowcaseBook("4", "Data Structure", 2010);

        inventory.addBook(paperBook);
        inventory.addBook(eBook);
        inventory.addBook(showcaseBookBook);
        try {
            double pricePaid1 = inventory.buyBook("6", 3, "nermeen@.com", "Giza");
            System.out.println("Paid amount: " + pricePaid1);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            double pricePaid2 = inventory.buyBook("3", 1, "nermeen@.com", "Cairo");
            System.out.println("Paid amount: " + pricePaid2);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            double pricePaid3 = inventory.buyBook("4", 1, "nermeen@.com", "Cairo");
            System.out.println("Paid amount: " + pricePaid3);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }


    }
}
