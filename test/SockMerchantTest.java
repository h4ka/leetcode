import org.junit.Test;

import static org.junit.Assert.*;

public class SockMerchantTest {

    @Test
    public void sockMerchant() {
        assertEquals(3, SockMerchant.sockMerchant(9, new int[] {10,20,20,10,10,30,50,10,20}));
        assertEquals(0, SockMerchant.sockMerchant(0, new int[] {}));
        assertEquals(0, SockMerchant.sockMerchant(1, new int[] {1}));

    }
}