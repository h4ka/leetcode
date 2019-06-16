import org.junit.Test;

import static org.junit.Assert.*;

public class CountingValleysTest {

    @Test
    public void countingValleys() {

        assertEquals(1, CountingValleys.countingValleys(8, "UDDDUDUU"));
        assertEquals(2, CountingValleys.countingValleys(12, "DDUUDDUDUUUD"));

    }
}