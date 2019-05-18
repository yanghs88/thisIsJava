package com.study.chapter8.question3;

public class Dog implements Soundable {
    @Override
    public String sound() {
        return "멍멍";
    }

    public String favoriteFood()
    {
        return "개껌";
    }
}
