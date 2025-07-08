package BookStore.Models;

import BookStore.Services.ShippingService;

public class PaperBook extends Book{
    private int quantity;
    public PaperBook(String ISBN, String title, int year, double price ,int quantity){
        super(ISBN, title, year, price);
        this.quantity = quantity;
    }

    @Override
    public boolean isAvailable() {
        return quantity > 0;
    }

    @Override
    public double buy(int q, String email, String address) {
        if (q > quantity){
            throw new RuntimeException("Not enough books");
        }
        quantity -= q;
        ShippingService.send(this,address);
        return price * q ;
    }

    @Override
    public boolean isOutdated(int currentYear, int maxYears) {
        return (currentYear - publishedYear) > maxYears;
    }
}
