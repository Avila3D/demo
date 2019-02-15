/**
 * @author Antonio Avila
 * CS 115 Assignment 2
 */

public class ConnFourChip {

    private String chipValueOf = "0";
    private String chipColor = "";

    //constructor

    public ConnFourChip(String chipValueOf, String chipColor) {

        this.chipValueOf = chipValueOf;
        this.chipColor = chipColor;

    }

    public String getChipValueOf() {
        return chipValueOf;
    }

    public void setChipValueOf(String chipValueOf) {
        this.chipValueOf = chipValueOf;
    }

    public String getChipColor() {
        return chipColor;
    }

    public void setChipColor(String chipColor) {
        this.chipColor = chipColor;
    }
} // end of ConnFourChip class
