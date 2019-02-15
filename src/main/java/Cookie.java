/**
 * @author Antonio Avila
 * CS 115 Assignment 3
 */

public class Cookie extends DessertItem {

    // variables

    private String cookieName;
    private double cookieAmount;
    private double cookiePricePerDozen;


    // methods

    public double calculateItemCost() {
        return Math.round(((cookiePricePerDozen/12) * cookieAmount)* 100.0) / 100.0;
    } // end of calculate cost method

    public double findSalesTax() {
        double cost = Math.round(((cookiePricePerDozen/12) * cookieAmount)* 100.0) / 100.0;
        return Math.round((cost * TAXRATE) * 100.0) / 100.0;
    } // end of find sales tax method


    // constructor

    public Cookie(String cookieName, double cookieAmount, double cookiePricePerDozen) {
        this.cookieName = cookieName;
        this.cookieAmount = cookieAmount;
        this.cookiePricePerDozen = cookiePricePerDozen;
    }

} // end of Candy class
