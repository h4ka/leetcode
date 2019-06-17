import org.junit.Test;

import static org.junit.Assert.*;

public class CloudJumpingTest {

    @Test
    public void jumpingOnClouds() {
        assertEquals(4, CloudJumping.jumpingOnClouds(new int[] {0,0,1,0,0,1,0}));
    }
}