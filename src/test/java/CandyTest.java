import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandyTest {

    @Test
    void calculateItemCost() {

        Candy reesesPieces = new Candy("Reese's Pieces", 1.33,.89);
        Candy taffy = new Candy("Salt Water Taffy", 1.5, 2.09);
        Candy corn = new Candy("Candy Corn", 3.0, 1.09);

        assertEquals(1.18, reesesPieces.calculateItemCost());
        assertEquals(3.14, taffy.calculateItemCost());
        assertEquals(3.27, corn.calculateItemCost());
        assertEquals(.04, reesesPieces.findSalesTax());
        assertEquals(.09, taffy.findSalesTax());
        assertEquals(.10, corn.findSalesTax());
    }
}