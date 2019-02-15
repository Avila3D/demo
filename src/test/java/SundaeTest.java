import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SundaeTest {

    @Test
    void calculateItemCost() {

        Sundae sundae = new Sundae("French Vanilla",1.05,"Candied Pecans", .50);

        assertEquals(1.55, sundae.calculateItemCost());
        assertEquals(.05, sundae.findSalesTax());
    }
}