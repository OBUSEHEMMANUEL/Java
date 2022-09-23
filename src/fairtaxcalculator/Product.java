package fairtaxcalculator;

public class Product {

private String name;
private double price;
    public Product(String name, double price) {
this.price  = price;
this.name = name;
    }

    public double getPrice() {
        return price;
    }

}
