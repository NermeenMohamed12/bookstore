package BookStore.Models;

import BookStore.Services.MailService;

public class EBook extends Book{
    private String fileType;
    public EBook(String ISBN, String title, int year, double price, String fileType){
        super(ISBN, title, year, price);
        this.fileType = fileType;
    }

    @Override
    public boolean isAvailable() {
        return true;
    }

    @Override
    public double buy(int q, String email, String address) {
        if (q != 1){
            throw new RuntimeException("Can only buy one book");
        }
        MailService.send(this, email);
        return price;
    }

    @Override
    public boolean isOutdated(int currentYear, int maxYears) {
        return (currentYear - publishedYear) > maxYears;
    }
}
