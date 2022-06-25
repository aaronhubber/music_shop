import Stock.Stock;
import interactionsFinancial.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stockList;

    public Shop(ArrayList<ISell> stockList) {
        this.stockList = new ArrayList<>();
    }

    public ArrayList<ISell> getStockList(){
        return this.stockList;
    }

    public int getNumberOfItemsInStockList(){
        return this.stockList.size();
    }

    public void addStockToStockList(ISell stock){
        this.stockList.add(stock);
    }

    public void removeStockToStockList(ISell stock){
        this.stockList.remove(stock);
    }
}
