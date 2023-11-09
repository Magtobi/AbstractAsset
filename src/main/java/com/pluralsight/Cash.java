package com.pluralsight;

public class Cash extends Asset {
    public double yourCash;
    public Cash(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }
    @Override
    public double getValue() {
        // Value of cash doesn't change
        return yourCash;
    }
}