package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {

    //ATTRIBUTES LIST:
    private long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliverDate;
    private List<Product> products;
    private Customer customer;


    //CONSTRUCTOR:
    public Order(Customer customer) {
        Random random = new Random();
        this.id = random.nextLong();
        this.status = "Order processed!";
        this.orderDate = LocalDate.now();
        this.deliverDate = LocalDate.now().plusWeeks(1);
        this.products = new ArrayList<>();
        this.customer = customer;
    }
}
