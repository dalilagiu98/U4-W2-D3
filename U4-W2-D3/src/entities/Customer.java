package entities;

import java.util.Random;

public class Customer {

    //ATTRIBUTES LIST:
    private long id;
    private String name;
    private int tier;

    //CONSTRUCTOR:
    public Customer(String name, int tier) {
        this.name = name;
        this.tier = tier;
        Random random = new Random();
        this.id = random.nextLong();
    }
}