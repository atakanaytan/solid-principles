package singleResponsibilityPrinciple.good;

import singleResponsibilityPrinciple.good.impl.ProductJsonExporter;
import singleResponsibilityPrinciple.good.impl.ProductXmlExporter;
import singleResponsibilityPrinciple.good.model.Book;
import singleResponsibilityPrinciple.good.model.Pencil;
import singleResponsibilityPrinciple.good.model.Product;

public class Main {

    public static void main(String[] args) {

        Product book   = new Book("Nikolai Gogol - The Overcoat", 19.99);
        Product pencil = new Pencil("Lamy", 8.99);

        ProductDataExporter<Product> productJsonExporter = new ProductJsonExporter<Product>();

        System.out.println(productJsonExporter.export(book));
        System.out.println(productJsonExporter.export(pencil));

        ProductDataExporter<Product> productXmlExporter = new ProductXmlExporter<Product>();

        System.out.println(productXmlExporter.export(book));
        System.out.println(productXmlExporter.export(pencil));
    }
}
