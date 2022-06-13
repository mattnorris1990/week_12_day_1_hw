import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(5, 5);
    }

    @Test
    public void hasSheets (){
        assertEquals(5, printer.getSheets());
    }

    @Test
    public void willPrint () {
        assertEquals("print complete!", printer.print(2,1));
    }

    @Test
    public void wontPrint () {
        assertEquals("cannot print", printer.print(2,3));
    }


    @Test
    public void willPrintAndReduceSheets (){
        printer.print(2,1);
        assertEquals(3, printer.getSheets());
    }

    @Test
    public void wontPrintAndWontReduceSheets (){
        printer.print(2,3);
        assertEquals(5,printer.getSheets());
    }

    @Test
    public void willPrintAndReduceToner (){
        printer.print(2,1);
        assertEquals(3, printer.getToner());
    }

    @Test
    public void wontPrintAndWontReduceToner (){
        printer.print(2,3);
        assertEquals(5,printer.getToner());
    }

}
