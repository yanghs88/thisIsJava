package com.study.solid.LSP;

public class SpecialItem extends Item {

    @Override
    public boolean isDiscountAvailable() {
        return false;
    }
}
