package service;

import lombok.extern.slf4j.Slf4j;
import model.Customer;
import model.Order;
import support.constant.CustomerType;

@Slf4j
public class OrderManagementSystem {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", CustomerType.getCustomerType("VIP"));
        Order order = new Order(customer);

        order.addItem("Laptop", 1000);
        order.addItem("Mouse", 50);
        order.addItem("Keyboard", 80);

        order.printOrder();

        generateInvoice(order);
    }

    public static void generateInvoice(Order order) {
        log.info("Generating Invoice...");
        log.info("Customer: " + order.customer.name);
        log.info("Total: $" + order.totalPrice);
        log.info("Discounted Total: $" + order.discountedPrice);
        log.info("Items: " + order.items);
        log.info("Thank you for shopping with us!");
    }
}