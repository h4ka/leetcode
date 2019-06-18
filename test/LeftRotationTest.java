import org.junit.Test;

import static org.junit.Assert.*;

public class LeftRotationTest {

    @Test
    public void rotLeft() {
        assertArrayEquals(new int[]{5,1,2,3,4}, LeftRotation.rotLeft( new int[]{1,2,3,4,5}, 4));
        assertArrayEquals(
                new int[]{41,73,89,7,10,1,59,58,84,77,77,97,58,1,86,58,26,10,86,51},
                LeftRotation.rotLeft( new int[]{77,97,58,1,86,58,26,10,86,51,41,73,89,7,10,1,59,58,84,77}, 10));
        assertArrayEquals(
                new int[]{87,97,33,47,70,37,8,53,13,93,71,72,51,100,60},
                LeftRotation.rotLeft( new int[]{33,47,70,37,8,53,13,93,71,72,51,100,60,87,97}, 13));
    }
}

