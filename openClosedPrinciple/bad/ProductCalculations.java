package openClosedPrinciple.bad;

import openClosedPrinciple.bad.model.Tax;
import singleResponsibilityPrinciple.good.model.Product;

import java.util.List;

public class ProductCalculations {

    public double calculatePriceOfProducts(List<Product> products) {

        double totalPrice = 0;

        for (Product product : products) {

                totalPrice += product.getPrice();
        }

        return totalPrice;
    }

    public double calculate(List<Product> products, List<Tax> taxes) {

        double totalTaxValue = 0;

        for (Product product : products) {

            double taxForProduct = 0;

            for (Tax tax : taxes) {

                taxForProduct += product.getPrice() * tax.getRatio();
            }

        }

        return totalTaxValue;
    }


}

