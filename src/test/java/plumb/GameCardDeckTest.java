package plumb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class GameCardDeckTest {

    PDeck deck = new GameCardDeck();
    PCard card = new GameCard("A \u25C6");
    PCard card2 = new GameCard("K \u25C6");
    PCard card3 = new GameCard("8 \u25C6");

    @Test
    void shuffle() {

        deck.addCard(card);
        deck.addCard(card2);
        deck.addCard(card2);
        deck.addCard(card3);
        deck.addCard(card3);
        deck.addCard(card3);
        assertEquals(6, deck.cardCount());
        deck.shuffle();
        assertNotEquals(card, deck.dealCard());

    }

    @Test
    void addCard() {
        deck.addCard(card);
        assertEquals(1, deck.cardCount());
        deck.addCard(card2);
        assertEquals(2, deck.cardCount());
        deck.addCard(card3);
        assertEquals(3, deck.cardCount());
    }

    @Test
    void dealCard() {
        PDeck deck = new GameCardDeck();
        PCard card = new GameCard("A \u25C6");
        deck.addCard(card);
        assertEquals(1, deck.cardCount());
        deck.dealCard();
        assertEquals(0, deck.cardCount());
    }

    @Test
    void dealHiddenCard() {
    }

    @Test
    void cardCount() {
        PDeck deck = new GameCardDeck();
        PCard card = new GameCard("A \u25C6");
        assertEquals(0, deck.cardCount());
        deck.addCard(card);
        assertEquals(1, deck.cardCount());
    }

}