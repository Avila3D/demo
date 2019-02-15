/**
 * @author Antonio Avila
 * CS 115 Assignment 4
 */

import java.util.ArrayList;
import java.util.List;

public class Checkout {

    // objects

    List<DessertItem> dessertList = new ArrayList();

    // variables

    private double numberOfDessertItems;
    private double totalCostOfDesserts;
    private double totalTaxOfDesserts;

    // methods

    public boolean add(DessertItem dessert) { // add items to list
        return dessertList.add(dessert);
    } // end of add method

    public int numberOfItems() { // check size of list to get number of items
        return dessertList.size();
    } // end of numberOfItems method

    public double totalCost() { // sum costs for list items and output total

        double sum = 0;
        for (DessertItem dessert: dessertList) {
            sum += dessert.calculateItemCost(); // add up all calculated cost from list
        }
        return sum;
    } // end of totalCost method

    public double totalTax() {

        double taxSum = 0;
        for (DessertItem dessert: dessertList) {
            taxSum += dessert.findSalesTax(); // add up all the item's calculated sales tax from list
        }
        return taxSum;

    } // end of totalTax method

    // constructor


    public Checkout() {
        this.dessertList = dessertList;
        this.numberOfDessertItems = numberOfDessertItems;
        this.totalCostOfDesserts = totalCostOfDesserts;
    }

    // setter and getter


    public List<DessertItem> getDessertList() {
        return dessertList;
    }

    public void setDessertList(List<DessertItem> dessertList) {
        this.dessertList = dessertList;
    }

    public double getNumberOfDessertItems() {
        return numberOfDessertItems;
    }

    public void setNumberOfDessertItems(double numberOfDessertItems) {
        this.numberOfDessertItems = numberOfDessertItems;
    }

    public double getTotalCostOfDesserts() {
        return totalCostOfDesserts;
    }

    public void setTotalCostOfDesserts(double totalCostOfDesserts) {
        this.totalCostOfDesserts = totalCostOfDesserts;
    }

    public double getTotalTaxOfDesserts() {
        return totalTaxOfDesserts;
    }

    public void setTotalTaxOfDesserts(double totalTaxOfDesserts) {
        this.totalTaxOfDesserts = totalTaxOfDesserts;
    }

} // end of Checkout class
