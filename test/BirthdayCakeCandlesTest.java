import org.junit.Test;

import static org.junit.Assert.*;

public class BirthdayCakeCandlesTest {

    @Test
    public void birthdayCakeCandles() {

        int[] arr = {3,2,1,3};
        assertEquals(2, BirthdayCakeCandles.birthdayCakeCandles(arr));

        int[] arr2 = {4,4,1,5,6,6,6,0,5};
        assertEquals(3, BirthdayCakeCandles.birthdayCakeCandles(arr2));

        int[] arr3 = {0};
        assertEquals(1, BirthdayCakeCandles.birthdayCakeCandles(arr3));

    }
}