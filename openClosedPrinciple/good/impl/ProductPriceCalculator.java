package openClosedPrinciple.good.impl;

import openClosedPrinciple.good.ProductCalculator;
import singleResponsibilityPrinciple.good.model.Product;

import java.util.List;

public class ProductPriceCalculator implements ProductCalculator {

    @Override
    public double calculate(List<Product> products) {

        double totalPrice = 0;

        for (Product product : products) {

            totalPrice += product.getPrice();
        }

        return totalPrice;
    }
}
