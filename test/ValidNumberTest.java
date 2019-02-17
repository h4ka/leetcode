import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidNumberTest {

    private ValidNumber validNumber = new ValidNumber();

    @Test
    public void isNumberTrue() throws Exception{
        assertTrue(validNumber.isNumber("0"));
        assertTrue(validNumber.isNumber(" 0.1 "));
        assertTrue(validNumber.isNumber("2e10"));
        assertTrue(validNumber.isNumber(" -90e3   "));
        assertTrue(validNumber.isNumber(" 6e-1"));
        assertTrue(validNumber.isNumber("53.5e93"));
    }

    @Test
    public void isNumberFalse() throws Exception{
        assertFalse(validNumber.isNumber("abc"));
        assertFalse(validNumber.isNumber("1 a"));
        assertFalse(validNumber.isNumber(" 1e"));
        assertFalse(validNumber.isNumber("e3"));
        assertFalse(validNumber.isNumber(" 99e2.5 " ));
        assertFalse(validNumber.isNumber(" --6 "));
        assertFalse(validNumber.isNumber("-+3"));
        assertFalse(validNumber.isNumber("95a54e53"));
        assertFalse(validNumber.isNumber(""));
        assertFalse(validNumber.isNumber("-"));
        assertFalse(validNumber.isNumber("01"));
        assertFalse(validNumber.isNumber(".1"));
    }
}