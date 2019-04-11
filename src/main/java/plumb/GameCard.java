package plumb;

import java.awt.*;

public class GameCard extends PCard {


    private String rankAndSuit;

    public String getText() {
        return rankAndSuit;
    }

    public GameCard(String rankAndSuit) {
        this.rankAndSuit = rankAndSuit;
    }

    boolean cardVisiblity = false;
    @Override
    public void showCard() {

        this.cardVisiblity = false;
    }

    @Override
    public void hideCard() {

        this.cardVisiblity = true;
    }

    @Override
    public boolean isHidden() {
        return cardVisiblity;
    }

    @Override
    public Color getFontColor() {
        return Color.BLACK;
    }

    @Override
    public Color getFaceColor() {
        return Color.LIGHT_GRAY;
    }

    @Override
    public Color getBackColor() {
        return Color.LIGHT_GRAY;
    }

    @Override
    public Color getBorderColor() {
        return Color.ORANGE;
    }

    @Override
    public Color getStripeColor() {
        return Color.BLUE;
    }
}
