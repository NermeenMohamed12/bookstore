package BookStore.Models;

public class ShowcaseBook extends Book {
    public ShowcaseBook(String ISBN, String title, int year){
        super(ISBN, title, year, 0);
    }
    @Override
    public boolean isAvailable() {
        return true;
    }

    @Override
    public double buy(int qty, String email, String address) {
        throw new RuntimeException("Showcase books  not for sale.");
    }

    @Override
    public boolean isOutdated(int currentYear, int maxAge) {
        return false;
    }
}
