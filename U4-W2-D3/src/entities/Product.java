package entities;

import java.util.Objects;
import java.util.Random;

public class Product {
    //ATTRIBUTES LIST:
    private long id;
    private String name;
    private String category;
    private double price;

    //CONSTRUCTOR
    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
        Random random = new Random();
        this.id = random.nextLong();
    }


    //METHODS:
    @Override
    public String toString() {
        return "Product -->" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
