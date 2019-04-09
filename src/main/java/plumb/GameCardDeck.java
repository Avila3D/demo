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
    PHandImpl hand = new PHandImpl();


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
        PCard cardToDeal = deck.get((deck.size() - 1));
        deck.remove((deck.size() - 1));
        return cardToDeal;
//(deck.size() - 1)
    }

    @Override
    public PCard dealHiddenCard() {

        PCard hiddenCardToDeal = deck.get((deck.size() - 1));
        deck.remove((deck.size() - 1));
        return hiddenCardToDeal;


    }

    @Override
    public int cardCount() {
        return deck.size();
    }


}




