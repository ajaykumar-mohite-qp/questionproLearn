package model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Order {
    private Customer customer;
    private List<String> items;
    private List<Double> prices;
    private double totalPrice;
    private double discountedPrice;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
        this.prices = new ArrayList<>();
    }

    public void addItem(String item, double price) {
        items.add(item);
        prices.add(price);
    }

    public void calculateTotal() {
        totalPrice = 0;
        for (double price : prices) {
            totalPrice += price;
        }
    }

    public void applyDiscountIfEligible(double discountedPercentage) {
        discountedPrice = totalPrice - (totalPrice * discountedPercentage);
    }

    public void printOrder() {
        log.info("Customer: " + customer.getName());
        log.info("Items: " + items);
        log.info("Total Price: " + totalPrice);
        log.info("Discounted Price: " + discountedPrice);
    }
}
