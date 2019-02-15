/**
 * @author Antonio Avila
 * CS 115 Assignment 4
 */

public class Sundae extends IceCream  {


    // variables

    private String toppingName;
    private double toppingCost;

    // constructor

    public Sundae(String iceCreamName, double iceCreamCost, String toppingName, double toppingCost) {
        super(iceCreamName, iceCreamCost);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }

// methods

    @Override
    public double calculateItemCost() {
        return getIceCreamCost() + toppingCost;
    } // end of calculate cost method

    @Override
    public double findSalesTax() {
        double cost = getIceCreamCost() + toppingCost;
        return Math.round((cost * TAXRATE) * 100.0) / 100.0;

    } // end of find sales tax method

} // end of Sundae class
