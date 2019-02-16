import org.junit.Test;

import static org.junit.Assert.*;

public class TimeConversionTest {

    @Test
    public void timeConversion() {
        assertEquals("00:59:59", TimeConversion.timeConversion("12:59:59AM"));
        assertEquals("12:59:59", TimeConversion.timeConversion("12:59:59PM"));
        assertEquals("12:00:00", TimeConversion.timeConversion("12:00:00PM"));
        assertEquals("00:00:00", TimeConversion.timeConversion("12:00:00AM"));
        assertEquals("01:00:00", TimeConversion.timeConversion("01:00:00AM"));
        assertEquals("13:00:00", TimeConversion.timeConversion("01:00:00PM"));
    }
}