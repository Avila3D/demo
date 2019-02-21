package plumb;

import org.junit.jupiter.api.Test;
import test.CardTest;

import static org.junit.jupiter.api.Assertions.*;

class GameCardTest {


    @Test
    void getText() {

        GameCard aceOfHearts = new GameCard("A \u2665");
        CardTest.run(aceOfHearts);
    }


}