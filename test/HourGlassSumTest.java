import org.junit.Test;

import static org.junit.Assert.*;

public class HourGlassSumTest {

    @Test
    public void getSum() {

        int[][] arr = new int[][]{
                {1,1,1,0,0,0} ,
                {0,1,0,0,0,0} ,
                {1,1,1,0,0,0} ,
                {0,0,2,4,4,0} ,
                {0,0,0,2,0,0} ,
                {0,0,1,2,4,0}
        };

        assertEquals(19, HourGlassSum.getSum(arr));
    }
}