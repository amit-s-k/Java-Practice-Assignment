package main.java.challenge1;

public enum AddOns {
    TOMATO(50),
    LETTUCE(60),
    CARROT(70),
    CUCUMBER(80),
    COKE(90),
    CHIPS(100),
    CHEESE(110),
    PANEER(120);

    int price;

    AddOns(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}
