import org.junit.Test;

import static org.junit.Assert.*;

public class LongestConsecutiveSequenceTest {

    @Test
    public void longestConsecutive() {


        assertEquals(4, LongestConsecutiveSequence.longestConsecutive(new int[]{100,4,200,1,3,2}));
        assertEquals(1, LongestConsecutiveSequence.longestConsecutive(new int[]{0,0}));
        assertEquals(0, LongestConsecutiveSequence.longestConsecutive(new int[]{}));
        assertEquals(3, LongestConsecutiveSequence.longestConsecutive(new int[]{1,2,0,1}));
        assertEquals(5, LongestConsecutiveSequence.longestConsecutive(new int[]{
                4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3
        }));
    }
}