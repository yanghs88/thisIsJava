package com.study.chapter6.question18;

public class ShopService {

    private static ShopService shopService = new ShopService();

    public static ShopService getInstance()
    {
        return shopService;
    }
}
