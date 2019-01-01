package main.java.challenge1;

import java.util.Arrays;

public class DeluxeHamburger extends Hamburger {
    private final int baseprice = 250;


    public DeluxeHamburger() {
        super(Arrays.asList(AddOns.COKE, AddOns.CHIPS));
    }

    public int getBasePrice() {
        return baseprice;
    }

    public int getGrandTotal() {
        return baseprice + getPriceOfAddOns().orElse(0);
    }

}
