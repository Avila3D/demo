package plumb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PHandImplTest {

    @Test
    void getSize() {

        PHand hand = new PHandImpl();
        assertEquals(0,hand.getSize());
        hand.addCard(new GameCard("A \u2665"));
        assertEquals(1,hand.getSize());
        hand.addCard(new GameCard("2 \u2665"));
        assertEquals(2,hand.getSize());
        hand.addCard(new GameCard("K \u2663"));
        assertEquals(3,hand.getSize());
        hand.addCard(new GameCard("8 \u25C6"));
        assertEquals(4,hand.getSize());
        hand.removeCard(0);
        assertEquals(3,hand.getSize());
    }

    @Test
    void addCard() {

        PHand hand = new PHandImpl();
        assertEquals(0,hand.getSize());
        hand.addCard(new GameCard("10 \u2665"));
        assertEquals(1,hand.getSize());
        hand.addCard(new GameCard("A \u2665"));
        assertEquals(2,hand.getSize());


    }

    @Test
    void getCard() {

        PHand hand = new PHandImpl();
        hand.addCard(new GameCard("A \u2665"));
        hand.addCard(new GameCard("2 \u2665"));
        hand.addCard(new GameCard("A \u2663"));
        assertEquals("A \u2665",hand.getCard(0).getText());
        assertEquals("2 \u2665",hand.getCard(1).getText());
        assertEquals("A \u2663",hand.getCard(2).getText());
    }

    @Test
    void removeCard() {

        PHand hand = new PHandImpl();
        hand.addCard(new GameCard("3 \u2665"));
        hand.addCard(new GameCard("8 \u2665"));
        hand.addCard(new GameCard("Q \u2663"));
        assertEquals(3,hand.getSize());
        hand.removeCard(0);
        assertEquals(2,hand.getSize());
        hand.removeCard(0);
        assertEquals(1,hand.getSize());
        assertEquals("3 \u2665",hand.getCard(0).getText());


    }

    @Test
    void getValue() {

        PHand hand = new PHandImpl();

        GameCard card1 = new GameCard("A \u2665");
        GameCard card2 = new GameCard("K \u2665");
        GameCard card3 = new GameCard("A \u2663");


        hand.addCard(card1);
        assertEquals(11, hand.getCard(0));
        hand.addCard(card2);
        assertEquals(10, hand.getCard(1));
        hand.addCard(card3);
        assertEquals(1, hand.getCard(3));


    }

}