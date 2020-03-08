package com.study.solid.DIP;

public class BMW {

    //bmw 에서 Tire로 이동할 수 있다.
    //연관관계는 영구적인 관계를 맺는다.
    //private SnowTire snowTire;


    //의존 관계
    //파라미터, 리턴타입에 타입이 나오거나 메서드 안에 타입을 생성한다면 의존관계가 성립한다.
//    public SnowTire setSnowTire(SnowTire snowTire) {
//        return new SnowTire();
//    }

    private Tire tire;

    public Tire getTire() {
        return tire;
    }
    public void setTire(Tire tire) {
        this.tire = tire;
    }

}
