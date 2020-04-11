package singleResponsibilityPrinciple.good.impl;

import singleResponsibilityPrinciple.good.ProductDataExporter;
import singleResponsibilityPrinciple.good.model.Product;

public class ProductXmlExporter <T extends Product> implements ProductDataExporter<T> {
    @Override
    public String export(T product) {

        String name = product.getName();
        double price = product.getPrice();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<Product");
        stringBuilder.append("<Name>");
        stringBuilder.append(name);
        stringBuilder.append("</Name>");
        stringBuilder.append("<Price>");
        stringBuilder.append(price);
        stringBuilder.append("</Price>");
        stringBuilder.append("</Product>");

        return stringBuilder.toString();
    }
}
