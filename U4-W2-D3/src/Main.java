import entities.Customer;
import entities.Order;
import entities.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //----------------------------------------------------INITIALIZING SHOP:-------------------------------------------------
        Product onePiece = new Product("One piece vol.1", "Book", 235.99);
        Product deathNote = new Product("Death Note vol.2", "Book", 2.99);
        Product gameOfThrones = new Product("A Song of Ice and Fire vol.4 ", "Book", 350.99);

        Product nappies = new Product("Pampers", "Baby", 5.99);
        Product dummy = new Product("Dummy", "Baby", 1.99);
        Product babyBottle = new Product("Biberon", "Baby", 3.99);

        Product razor = new Product("Gillette razors", "Boys", 3.99);
        Product ball = new Product("Ball for football", "Boys", 7.99);
        Product boardGame = new Product("Risiko", "Boys", 23.50);

        //Creating a new ArrayList:
        List<Product> productList = new ArrayList<>();
        productList.addAll(Arrays.asList(onePiece, deathNote, gameOfThrones, nappies, dummy, babyBottle, razor, ball, boardGame));


        //----------------------------------------------------INITIALIZING CUSTOMERS:-------------------------------------------------
        Customer aldo = new Customer("Aldo", 2);
        Customer giovanni = new Customer("Giovanni", 1);
        Customer giacomo = new Customer("Giacomo", 3);
        Customer franco = new Customer("Franco", 2);
        Customer ciccio = new Customer("Ciccio", 1);

        //Creating a new ArrayList:
        List<Customer> customersList = new ArrayList<>();
        customersList.addAll(Arrays.asList(aldo, giovanni, giacomo, franco, ciccio));


        //----------------------------------------------------INITIALIZING ORDERS:-------------------------------------------------
        Order aldoOrder = new Order(customersList.get(0));
        Order giovanniOrder = new Order(customersList.get(1));
        Order giacomoOrder = new Order(customersList.get(2));
        Order francoOrder = new Order(customersList.get(3));
        Order ciccioOrder = new Order(customersList.get(4));

        Product pacifier = productList.get(4);
        Product  biberon = productList.get(5);
        Product book = productList.get(2);
        Product razors = productList.get(6);
        Product boardGames = productList.get(8);

        aldoOrder.addProduct(pacifier);
        aldoOrder.addProduct(razors);
        aldoOrder.addProduct(boardGames);

        giovanniOrder.addProduct(biberon);
        giovanniOrder.addProduct(book);

        giacomoOrder.addProduct(pacifier);
        giacomoOrder.addProduct(razors);
        giacomoOrder.addProduct(biberon);

        francoOrder.addProduct(razors);
        francoOrder.addProduct(boardGames);

        ciccioOrder.addProduct(book);

        //Create a new ArrayList:
        List<Order> orderList = new ArrayList<>();
        orderList.addAll(Arrays.asList(aldoOrder, giovanniOrder, giacomoOrder, francoOrder, ciccioOrder));
        System.out.println(orderList);

        //-------------------------------------------------EXERCISE 1----------------------------------------------------
        System.out.println("----------------LIST OF PRODUCTS THAT BELONGS TO THE BOOK CATEGORY WITH PRICE > 100-------------");
        List<Product> listBooks = productList.stream().filter(product -> product.getCategory().equals("Book") && product.getPrice() > 100).toList();
        System.out.println(listBooks);
    }
}