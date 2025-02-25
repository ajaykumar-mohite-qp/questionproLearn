package model;

import lombok.Getter;
import support.constant.CustomerType;

@Getter
public class Customer {
    private String name;
    private CustomerType type;

    public Customer(String name, CustomerType type) {
        this.name = name;
        this.type = type;
    }
}
