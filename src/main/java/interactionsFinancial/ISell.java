package interactionsFinancial;

public interface ISell {

    public Double calculateMarkUp(Double sellingPrice, Double buyingPrice);

    public double getBuyingPrice();

    public double getSellingPrice() ;

    public void setSellingPrice(double sellingPrice);
    }


