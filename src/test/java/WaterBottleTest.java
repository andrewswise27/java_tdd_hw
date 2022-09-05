import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;
    @Before
    public void before() {waterBottle = new WaterBottle(100);}
    @Test
    public void canDrink() {assertEquals(waterBottle.Drink(), 90);}
    @Test
    public void canEmpty() {assertEquals(waterBottle.Empty(), 0);}
    @Test
    public  void canFill(){assertEquals(waterBottle.Fill(), 100);}
}
