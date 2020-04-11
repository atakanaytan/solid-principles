package singleResponsibilityPrinciple.good.impl;

import singleResponsibilityPrinciple.good.ProductDataExporter;
import singleResponsibilityPrinciple.good.model.Product;

public class ProductJsonExporter < T extends Product> implements ProductDataExporter<T> {

    @Override
    public String export(T product) {

        String name = product.getName();
        double price = product.getPrice();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{ product: ");
        stringBuilder.append(" {");
        stringBuilder.append("name: ");
        stringBuilder.append(name);
        stringBuilder.append(",");
        stringBuilder.append("price: ");
        stringBuilder.append(price);
        stringBuilder.append(" }");
        stringBuilder.append("}");

        return stringBuilder.toString();
    }


}
