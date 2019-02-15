import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IceCreamTest {

    @Test
    void calculateItemCost() {

        IceCream cookiesNCream = new IceCream("Cookies 'n Cream",1.45);

        assertEquals(1.45, cookiesNCream.calculateItemCost());
        assertEquals(.04, cookiesNCream.findSalesTax());
    }
}