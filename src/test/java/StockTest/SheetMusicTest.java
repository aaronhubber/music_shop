package StockTest;

import Stock.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(2.99, 9.99, "David Reach", 1994);
    }

    @Test
    public void hasAuthor(){
        assertEquals("David Reach", sheetMusic.getAuthor());
    }

    @Test
    public void hasYearOfPublication(){
        assertEquals(1994, sheetMusic.getYearOfPublication());
    }



}
