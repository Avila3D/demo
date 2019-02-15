import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DessertShopTest {

    @Test
    void main() {

        Checkout checkout = new Checkout(); // instantiate checkout object

        checkout.add(new IceCream("Strawberry Ice Cream", 1.45));
        checkout.add(new Sundae("Vanilla Ice Cream", 1.05, "Caramel", 0.50));
        checkout.add (new Candy("Gummy Worms", 1.33, 0.89));
        checkout.add (new Cookie("Chocolate Chip Cookies", 4, 3.99));
        checkout.add (new Candy("Salt Water Taffy", 1.5, 2.09));
        checkout.add (new Candy("Candy Corn", 3.0, 1.09));
        System.out.println("\nNumber of items: " + checkout.numberOfItems() + "\n");
        System.out.println("\nTotal pretax cost: " + checkout.totalCost() + "\n");
        System.out.println("\nTotal taxes cost: " + checkout.totalTax() + "\n");
        System.out.println("\nTotal cost: " + (checkout.totalCost() + checkout.totalTax()) + "\n");
        System.out.println(checkout);


        assertEquals(6, checkout.numberOfItems());
        assertEquals(11.92,checkout.totalCost());
        assertEquals(.36, checkout.totalTax());
        assertEquals(12.28,checkout.totalCost() + checkout.totalTax());
    }



}