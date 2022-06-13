import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before (){
        waterbottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void drinkReducesBy10(){
        waterbottle.drink();
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void twodrinksReducesBy20(){
        waterbottle.drink();
        waterbottle.drink();
        assertEquals(80, waterbottle.getVolume());
    }

    @Test
    public void emptyReducesVolumeToZero(){
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void fillMakesVolume100(){
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume());
    }

}
