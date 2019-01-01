package main.java.challenge1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Hamburger {
    private List<AddOns> addOns;
    private int basePrice = 150;

    public Hamburger(List<AddOns> addOns) {
        this.addOns = addOns;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public List<AddOns> getAddOns() {
        return Arrays.asList(AddOns.values());
    }

    protected Optional<Integer> getPriceOfAddOns() {
        return addOns.stream().map(AddOns::getPrice).reduce((item1, item2) -> item1 + item2);
    }

    public int getGrandTotal() {
        return basePrice + getPriceOfAddOns().orElse(0);
    }

}
