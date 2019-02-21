package plumb;

public class GameCard extends PCard {


    private String rankAndSuit;

    public String getText() {
        return rankAndSuit;
    }

    public GameCard(String rankAndSuit) {
        this.rankAndSuit = rankAndSuit;
    }
}
