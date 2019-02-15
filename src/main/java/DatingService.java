/**
 * @author Antonio Avila
 */

public class DatingService {

    public String dateIdeas(String day) {
        if(day.equals("Sunday")) {
            return "go to church";
        }
        else if(day.equals("Monday")) {
            return "go to FHE";
        }
        return "go to tacos";
    }

}
