package plumb;

import java.util.ArrayList;
import java.util.List;

public class PHandImpl implements PHand {

    // create list to hold cards in hand
    List<PCard> hand = new ArrayList<PCard>();


    @Override
    public int getSize() {

        // returns number of cards in hand
        return hand.size();
    }

    @Override
    public void addCard(PCard card) {

        // add card to hand list/array
        hand.add(card);

    }

    @Override
    public PCard getCard(int index) {

        // get or return card from hand (but not removed)
        return hand.get(index);
    }

    @Override
    public PCard removeCard(int index) {

        // remove card and return card
        return hand.remove(index);
    }

    @Override
    public int getValue() {

        // initialize counter
        int handValue = 0;

        // check each card in hand and sum up values
        for (int i = 0; i < this.hand.size(); i++) {

            // handle value of Ace
            if (hand.get(i).getText().contains("A") && handValue < 11) {
                handValue += 11;
            } else if (hand.get(i).getText().contains("A") && handValue >= 10) {
                handValue += 1;

            // handle all other cards
            } else if (hand.get(i).getText().contains("2")) {
                handValue += 2;
            } else if (hand.get(i).getText().contains("3"))  {
                handValue += 3;
            } else if (hand.get(i).getText().contains("4")) {
                handValue += 4;
            } else if (hand.get(i).getText().contains("5")) {
                handValue += 5;
            } else if (hand.get(i).getText().contains("6")) {
                handValue += 6;
            } else if (hand.get(i).getText().contains("7")) {
                handValue += 7;
            } else if (hand.get(i).getText().contains("8")) {
                handValue += 8;
            } else if (hand.get(i).getText().contains("9")) {
                handValue += 9;
            } else {
                handValue += 10;
            }


        }
        return handValue;
    }
}