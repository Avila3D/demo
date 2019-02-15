/**
 * @author Antonio Avila
 * CS 115 Assignment 4
 */

public abstract class DessertItem {

    // variables

    private String name;
    public static final double TAXRATE = .03;

    // methods

    public double calculateItemCost() {
        return 0;
    }

    public abstract double findSalesTax();

    // getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

