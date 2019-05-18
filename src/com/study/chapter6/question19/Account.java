package com.study.chapter6.question19;

public class Account {

    private int balance = 0;

    public static final int MIN_BALANCE = 0;
    public static final int MAX_BLANACE = 1000000;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {

        if (balance < 0) {
            return;
        }

        if (Account.MIN_BALANCE <= balance && balance <= Account.MAX_BLANACE) {
            this.balance = balance;
        }
    }
}
