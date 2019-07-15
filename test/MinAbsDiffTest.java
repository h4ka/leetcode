import org.junit.Test;

import static org.junit.Assert.*;

public class MinAbsDiffTest {

    @Test
    public void minimumAbsoluteDifference() {

        int[] arr = {-59,-36,-13,1,-53,-92,-2,-96,-54,75};
        assertEquals(1, MinAbsDiff.minimumAbsoluteDifference(arr));

        assertEquals(2, MinAbsDiff.minimumAbsoluteDifference(new int[] {10,12}));

    }
}