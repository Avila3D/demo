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

    @Override
    public void showCard() {
        super.showCard();
    }

    @Override
    public void hideCard() {

        super.hideCard();
    }

    @Override
    public boolean isHidden() {
        return false;
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
