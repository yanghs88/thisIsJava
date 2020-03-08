package com.study.solid.LSP;

public class Item {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isDiscountAvailable() {
        return true;
    }
}
