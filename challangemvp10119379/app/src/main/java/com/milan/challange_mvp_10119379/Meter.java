package com.milan.challange_mvp_10119379;

public class Meter {
    private double meter;

    public void setMeter(double celsius) {
        this.meter = celsius;
    }

    public double toKilometer() {
        return meter / 1000;
    }

    public double toCentimeter() {
        return meter * 100;
    }
}
