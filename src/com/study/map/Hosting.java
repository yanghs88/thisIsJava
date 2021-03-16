package com.study.map;

import lombok.Getter;

@Getter
public class Hosting {
    private int Id;
    private String name;
    private long websites;

    public Hosting(int id, String name, long websites) {
        Id = id;
        this.name = name;
        this.websites = websites;
    }
}
