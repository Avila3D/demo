import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CookieTest {

    @Test
    void calculateItemCost() {

        Cookie snickerdoodles = new Cookie("Snickerdoodle", 4,3.99);

        assertEquals(1.33,snickerdoodles.calculateItemCost());
        assertEquals(.04, snickerdoodles.findSalesTax());
    }
}