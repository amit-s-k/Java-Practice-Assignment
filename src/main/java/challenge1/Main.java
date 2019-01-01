package main.java.challenge1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Addons for hamburger: ");
        List<AddOns> addOnsList;
        try {
            addOnsList = Arrays.stream(bufferedReader.readLine().split(" ")).map(item -> AddOns.valueOf(item.toUpperCase())).collect(Collectors.toList());
        } catch (IllegalArgumentException e) {
            addOnsList = Collections.emptyList();
            System.out.println("Invalid Add On! Please check the menu");
        }
        Hamburger hamburger = new Hamburger(addOnsList.subList(0, 3));
        System.out.println("Grand Total : " + hamburger.getGrandTotal());
        HealthyHamburger healthyHamburger = new HealthyHamburger(addOnsList);
        healthyHamburger.getGrandTotal();
        System.out.println("Grand Total : " + healthyHamburger.getGrandTotal());
        DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
        System.out.println("Grand Total: " + deluxeHamburger.getGrandTotal());
    }
}
