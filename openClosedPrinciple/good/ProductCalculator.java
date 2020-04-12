package openClosedPrinciple.good;

import singleResponsibilityPrinciple.good.model.Product;

import java.util.List;

public interface ProductCalculator {

    double calculate(List<Product> products);
}
