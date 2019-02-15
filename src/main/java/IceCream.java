/**
 * @author Antonio Avila
 * CS 115 Assignment 4
 */

public class IceCream extends DessertItem {

    // variables

    private String iceCreamName;
    private double iceCreamCost;


    // methods

    public double calculateItemCost() {
        return iceCreamCost;
    } // end of calculate cost method

    public double findSalesTax() {
        return Math.round((iceCreamCost * TAXRATE) * 100.0) / 100.0;
    } // end of find sales tax method


    // constructor


    public IceCream(String iceCreamName, double iceCreamCost) {
        this.iceCreamName = iceCreamName;
        this.iceCreamCost = iceCreamCost;
    }


    // getters and setters


    public String getIceCreamName() {
        return iceCreamName;
    }

    public void setIceCreamName(String iceCreamName) {
        this.iceCreamName = iceCreamName;
    }

    public double getIceCreamCost() {
        return iceCreamCost;
    }

    public void setIceCreamCost(double iceCreamCost) {
        this.iceCreamCost = iceCreamCost;
    }
}
