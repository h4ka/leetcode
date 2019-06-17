import org.junit.Test;

import static org.junit.Assert.*;

public class CodilityDemoTest {

    @Test
    public void solution() {
        assertEquals(5, CodilityDemo.solution(new int[] {1, 3, 6, 4, 1, 2}));
        assertEquals(4, CodilityDemo.solution(new int[] {1, 2, 3}));
    }
}