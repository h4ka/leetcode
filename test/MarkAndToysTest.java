import org.junit.Test;

import static org.junit.Assert.*;

public class MarkAndToysTest {

    @Test
    public void maximumToys() {

        int[] arr = {1,12,5,111,200,1000,10};
        assertEquals(4, MarkAndToys.maximumToys(arr, 50));

        arr = new int[] {3,7,2,9,4};
        assertEquals(3, MarkAndToys.maximumToys(arr, 15));

    }
}