import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void twoSum() {
        assertArrayEquals(new int[] {0,1}, TwoSum.twoSum(new int[] { 2, 7, 11, 15 }, 9));
    }
}