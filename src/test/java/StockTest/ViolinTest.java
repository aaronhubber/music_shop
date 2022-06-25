package StockTest;

import Stock.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before(){
        violin = new Violin(60, 200,"maple wood", "string", 4,  "horse hair");
    }

    @Test
    public void hasMaterial(){
        assertEquals("maple wood", violin.getMaterial());
    }

    @Test
    public void hasType(){
        assertEquals("string", violin.getType());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(4, violin.getNumberOfStrings());
    }

    @Test
    public void materialForBow(){
        assertEquals("horse hair", violin.getMaterialForBows());
    }

    @Test
    public void canPlay(){
        assertEquals("Screeeeee", violin.play());
    }
    @Test
    public void hasBuyingPrice(){
        assertEquals(60.00, violin.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(200.00, violin.getSellingPrice(), 0.0);
    }

    @Test
    public void canChangeSellingPrice(){
        violin.setSellingPrice(160.00);
        assertEquals(160.00, violin.getSellingPrice(), 0.0);
    }
    @Test
    public void hasMarkUp(){
        assertEquals(140, violin.calculateMarkUp(violin.getSellingPrice(), violin.getBuyingPrice()), 0.0);
    }


}
