package entities;

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
}
