package singleResponsibilityPrinciple.bad;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("Fyodor Mihayloviç Dostoyevski - Gambler", 14.99);

        System.out.println(book.exportAsJson());
        System.out.println("-----------------");
        System.out.println(book.exportAsXml());
    }
}
