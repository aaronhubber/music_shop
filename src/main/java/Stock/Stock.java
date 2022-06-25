package Stock;

import interactionsFinancial.ISell;

public abstract class Stock implements ISell {

    private double buyingPrice;
    private double sellingPrice;

    public Stock(double buyingPrice, double sellingPrice) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    @Override
    public double getBuyingPrice() {
        return buyingPrice;
    }

    @Override
    public double getSellingPrice() {
        return sellingPrice;
    }

    @Override
    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double calculateMarkUp(){
        return sellingPrice - buyingPrice;
    }
}
