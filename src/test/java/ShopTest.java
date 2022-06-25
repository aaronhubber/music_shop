import Stock.SheetMusic;
import Stock.Violin;
import interactionsFinancial.ISell;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Violin violin;
    SheetMusic sheetMusic;
    ArrayList<ISell> stockList;

    @Before
    public void before(){
        violin = new Violin(50.00, 150.00, "cedar wood", "string", 4, "plastic");
        sheetMusic = new SheetMusic(2, 12, "Earl Jam", 2000);
        stockList = new ArrayList<ISell>();
        shop = new Shop(stockList);
    }

    @Test
    public void shopHasStockList(){
        assertEquals(stockList, shop.getStockList());
    }

    @Test
    public void canAddToStockList(){
        shop.addStockToStockList(violin);
        shop.addStockToStockList(sheetMusic);
        assertEquals(2, shop.getNumberOfItemsInStockList());
    }

    @Test
    public void canRemoveFromStockList(){
        shop.addStockToStockList(violin);
        shop.addStockToStockList(sheetMusic);
        shop.removeStockToStockList(sheetMusic);
        assertEquals(1, shop.getNumberOfItemsInStockList());
    }

}
