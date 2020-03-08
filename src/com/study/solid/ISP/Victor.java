package com.study.solid.ISP;

public class Victor implements Developable, Prayable, Shootable, Cookable {

    @Override
    public void cook() {
        System.out.println("요리를 한다.");
    }

    @Override
    public void develop() {
        System.out.println("개발을 한다.");
    }

    @Override
    public void pray() {
        System.out.println("기도를 한다.");
    }

    @Override
    public void shoot() {
        System.out.println("사격을 한다.");
    }
}
