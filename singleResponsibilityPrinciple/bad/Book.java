package singleResponsibilityPrinciple.bad;

public class Book  {

    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String exportAsJson() {

        String name = this.getName();
        double price = this.getPrice();

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

    public String exportAsXml() {

        String name = this.getName();
        double price = this.getPrice();

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
