import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedStringTest {

    @Test
    public void repeatedString() {

        assertEquals(7, RepeatedString.repeatedString("aba", 10));
        assertEquals(1000000000000L, RepeatedString.repeatedString("a", 1000000000000L));
        assertEquals(51574523448L, RepeatedString.repeatedString(
                "kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm",
                736778906400L));

        assertEquals(162401559918L, RepeatedString.repeatedString(
                "bcbccacaacbbacabcabccacbccbababbbbabcccbbcbcaccababccbcbcaabbbaabbcaabbbbbbabcbcbbcaccbccaabacbbacbc",
                649606239668L));

    }
}



