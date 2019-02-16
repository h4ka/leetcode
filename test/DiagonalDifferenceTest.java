import org.junit.Test;

import static org.junit.Assert.*;

public class DiagonalDifferenceTest {

    @Test
    public void diagonalDifference() {

        int[][] arr = {{11,4,10},{2,5,8},{4,6,-12}};

        assertEquals(15, DiagonalDifference.diagonalDifference(arr));

    }
}