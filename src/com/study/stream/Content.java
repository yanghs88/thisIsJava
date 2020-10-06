package com.study.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Content {

    private int no;
    private String title;

    private List<Goods> goodsList;

    public static class Goods {
        public Goods(int goodsNo, int goodsSubNo) {
            this.goodsNo = goodsNo;
            this.goodsSubNo = goodsSubNo;
        }

        private int goodsNo;
        private int goodsSubNo;

        public int getGoodsNo() {
            return goodsNo;
        }

        public int getGoodsSubNo() {
            return goodsSubNo;
        }

        @Override
        public String toString() {
            return "Goods{" +
                    "goodsNo=" + goodsNo +
                    ", goodsSubNo=" + goodsSubNo +
                    '}';
        }
    }

    public Content(int no, String title, List<Goods> goodsList) {
        this.no = no;
        this.title = title;
        this.goodsList = goodsList;
    }


    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public List<String> convertGoods() {
        List<String> collect = this.getGoodsList().stream()
                .map(s -> s.getGoodsNo() + "_0")
                .collect(Collectors.toList());

        return collect;
    }

    @Override
    public String toString() {
        return "Content{" +
                "no=" + no +
                ", title='" + title + '\'' +
                ", goodsList=" + goodsList +
                '}';
    }
}
