import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void twoSum() {

        TwoSum classUnderTest = new TwoSum();

        int[] arr = { 2, 7, 11, 15 };
        int target = 9;

        int[] out = classUnderTest.twoSum(arr,target);

        assertTrue(out[0] == 0 && out[1] == 1 );

    }
}