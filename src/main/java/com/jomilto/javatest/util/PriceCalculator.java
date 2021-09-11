package com.jomilto.javatest.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PriceCalculator {
    private List<Double> prices = new ArrayList<>();
    private double discount = 0.0;

    public double getTotal() {
        Optional<Double> sum = this.prices.stream().reduce((a, b) -> a + b);
        double total = sum.orElse(0.0) * (1- (this.discount/100));

        return total;
    }

    public void addPrice(double price) {
        this.prices.add(price);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
