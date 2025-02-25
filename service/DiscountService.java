package service;

import support.constant.CustomerType;

@Component
public class DiscountService {

    public double fetchDiscountByCustomerType(CustomerType customerType) {
        switch (customerType) {
            case PREMIUM:
                return 0.05;

            case VIP:
                return 0.1;

            default:
                return 0.2;
        }
    }
}
