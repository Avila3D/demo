/**
 * @author Antonio Avila
 * CS 115 Assignment 4
 */

public class Candy extends DessertItem {

    // variables

    private String candyName;
    private double candyPricePerPound;
    private double candyWeight;

    // methods

    public double calculateItemCost() {
        return Math.round((candyPricePerPound * candyWeight) * 100.0) / 100.0;
    } // end of calculate cost method

    public double findSalesTax() {
        double cost = Math.round((candyPricePerPound * candyWeight) * 100.0) / 100.0;
        return Math.round((cost * TAXRATE) * 100.0) / 100.0;
    } // end of find sales tax method

    // constructor

    public Candy(String candyName, double candyPricePerPound, double candyWeight) {
        this.candyName = candyName;
        this.candyPricePerPound = candyPricePerPound;
        this.candyWeight = candyWeight;
    }


} // end of Candy class
