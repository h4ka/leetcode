import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class AVeryBigSumTest {



    @Test
    public void aVeryBigSum() {

        long[] ar = {1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L};

        assertEquals(5000000015L, AVeryBigSum.aVeryBigSum(ar));


    }
}