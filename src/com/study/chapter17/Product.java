package com.study.chapter17;

import java.io.Serializable;

public class Product implements Serializable {
    private Integer id;
    private String goodsName = "";

    public Product(Integer id, String goodsName) {
        this.id = id;
        this.goodsName = goodsName;
    }

    @Override
    public String toString() {
        return "Product{" +
            "id=" + id +
            ", goodsName='" + goodsName + '\'' +
            '}';
    }
}
