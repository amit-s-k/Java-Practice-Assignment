package main.java.challenge1;

import java.util.List;

public class HealthyHamburger extends Hamburger {
    private final int baseprice = 200;

    public HealthyHamburger(List<AddOns> addOns) {
        super(addOns);
    }

    public int getBasePrice() {
        return baseprice;
    }

    public int getGrandTotal() {
        return baseprice + getPriceOfAddOns().orElse(0);
    }
}
