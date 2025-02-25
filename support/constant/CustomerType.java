package support.constant;

import java.util.Arrays;
import java.util.Optional;

public enum CustomerType {
    REGULAR("REGULAR"),
    PREMIUM("PREMIUM"),
    VIP("VIP");

    private String value;

    CustomerType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static CustomerType getCustomerType(String value) {
        Optional<CustomerType> customerTypeOptional = Arrays.stream(CustomerType.values())
                .filter(customerType -> value.equals(customerType.getValue())).findAny();


        if (customerTypeOptional.isEmpty()) {
            throw new IllegalArgumentException("Invalid customer type " + value)
        }
        return customerTypeOptional.get();
    }

}