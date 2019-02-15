/**
 * @author Antonio Avila
 * CS 115 Assignment 2
 */

public class ConnFourCell {

    private String cellValueOf = "0";
    private String cellColor = "";

    // constructor

    public ConnFourCell(String cellValueOf, String cellColor) {

        this.cellValueOf = cellValueOf;
        this.cellColor = cellColor;
    }

    public String getCellValueOf() {
        return cellValueOf;
    }

    public void setCellValueOf(String cellValueOf) {
        this.cellValueOf = cellValueOf;
    }

    public String getCellColor() {
        return cellColor;
    }

    public void setCellColor(String cellColor) {
        this.cellColor = cellColor;
    }
} // end of ConnFourCell class
