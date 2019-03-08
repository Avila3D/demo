/**
 * This class implements the PDeck Interface to create a deck of PCards
 * @ author Antonio Avila
 * 2/27/19
 */

package plumb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameCardDeck implements PDeck {

    // create list to hold cards
    List<PCard> deck = new ArrayList<PCard>();


    @Override
    public void shuffle() {
        Collections.shuffle(deck);
    }

    @Override
    public void addCard(PCard card) {

        deck.add(card);
    }

    @Override
    public PCard dealCard() {
        PCard cardToDeal = deck.get(-0);
        deck.remove(-0);
        return cardToDeal;
    }
    @Override
    public PCard dealHiddenCard() {
        return null;
    }
    @Override
    public int cardCount() {
        return deck.size();
    }


}




