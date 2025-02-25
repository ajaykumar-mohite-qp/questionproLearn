package model;

import lombok.Getter;
import support.constant.CustomerType;

@Getter
public class Customer {
    private String name;
    private CustomerType type;
    private double discount;

    public Customer(String name, CustomerType type) {
        this.name = name;
        this.type = type;
        setDiscount();
    }

    public void setDiscount() {
        if (type == CustomerType.REGULAR) {
            discount = 0.05;
        } else if (type == CustomerType.PREMIUM) {
            discount = 0.1;
        } else (type == CustomerType.VIP) {
            discount = 0.2;
        }
    }
}
