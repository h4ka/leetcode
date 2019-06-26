import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void countSwaps() {

        int[] arr = {3,2,1};
        assertEquals(3, BubbleSort.countSwaps(arr));

        arr = new int[] {1,2,3};
        assertEquals(0, BubbleSort.countSwaps(arr));

        arr = new int[] {4,2,3,1};
        assertEquals(5, BubbleSort.countSwaps(arr));



    }
}