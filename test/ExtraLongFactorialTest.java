import org.junit.Test;

import static org.junit.Assert.*;

public class ExtraLongFactorialTest {

    @Test
    public void extraLongFactorials() {
        assertEquals("15511210043330985984000000", ExtraLongFactorial.extraLongFactorials(25));
    }
}