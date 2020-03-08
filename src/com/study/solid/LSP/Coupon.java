package com.study.solid.LSP;

public class Coupon {

    private double discountRate = 0.1;

    public double calculateDiscountAmount(Item item) {
//        if (item instanceof SpecialItem) { //LSP 위반
//            return 0;
//        }

        if (!item.isDiscountAvailable()) {
            return 0;
        }

        return item.getPrice() * discountRate;
    }
}
