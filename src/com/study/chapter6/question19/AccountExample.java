package com.study.chapter6.question19;

public class AccountExample {
    public static void main(String[] args) {

        Account account = new Account();
        account.setBalance(100000);
        System.out.println("현재 잔고 : " + account.getBalance());

        account.setBalance(-100);
        System.out.println("현재 잔고 : " + account.getBalance());

        account.setBalance(2000000);
        System.out.println("현재 잔고 : " + account.getBalance());

        account.setBalance(50000);
        System.out.println("현재 잔고 : " + account.getBalance());

    }
}
