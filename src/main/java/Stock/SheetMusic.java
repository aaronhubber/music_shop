package Stock;

import interactionsFinancial.ISell;

public class SheetMusic extends Stock{

    private String author;
    private int yearOfPublication;


    public SheetMusic(double buyingPrice, double sellingPrice, String author, int yearOfPublication) {
        super(buyingPrice, sellingPrice);
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Override
    public Double calculateMarkUp(Double sellingPrice, Double buyingPrice) {
        return null;
    }
}
