package singleResponsibilityPrinciple.good;

import singleResponsibilityPrinciple.good.model.Product;

public interface ProductDataExporter <T extends Product>{

    String export(T product);
}
