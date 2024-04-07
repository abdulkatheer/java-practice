package org.example.enumeration.learning;

enum InrFxRate {
    GBP(100.76),
    EUR(78.65),
    AUD(56.43);

    private double rate;

    InrFxRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}

public class Part3 {
    public static void main(String[] args) {
        for (InrFxRate inrFxRate : InrFxRate.values()) {
            System.out.printf("INR to %s @ %.2f%n", inrFxRate.name(), inrFxRate.getRate());
        }
    }
}
