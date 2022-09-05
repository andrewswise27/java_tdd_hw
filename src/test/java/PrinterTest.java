import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;
    @Before
    public void before() {printer = new Printer(100, 100);}
    @Test
    public void canPrint() {assertEquals(printer.Print(2, 4), "Printing... you have 92  sheets of paper left & 92 ml of toner left.");}
}
