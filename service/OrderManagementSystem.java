package service;

import lombok.extern.slf4j.Slf4j;
import model.Customer;
import model.Order;
import support.constant.CustomerType;

@Slf4j
public class OrderManagementSystem {

    private static final int THOUSAND = 1000;
    private static final int FIFTY = 50;
    private static final int EIGHTY = 80;
    private static final String LAPTOP = "Laptop";
    private static final String MOUSE = "Mouse";
    private static final String KEYBOARD = "Keyboard";

    @Autowired
    private static DiscountService discountService;

    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", CustomerType.getCustomerType("VIP"));
        Order order = new Order(customer);

        order.addItem(LAPTOP, THOUSAND);
        order.addItem(MOUSE, FIFTY);
        order.addItem(KEYBOARD, EIGHTY);

        order.calculateTotal();
        order.applyDiscountIfEligible(
                discountService.fetchDiscountByCustomerType(CustomerType.VIP)
        );

        order.printOrder();

        generateInvoice(order);
    }

    public static void generateInvoice(Order order) {
        log.info("Generating Invoice...");
        log.info("Customer: " + order.getCustomer());
        log.info("Total: $" + order.getTotalPrice());
        log.info("Discounted Total: $" + order.getDiscountedPrice());
        log.info("Items: " + order.getItems());
        log.info("Thank you for shopping with us!");
    }
}