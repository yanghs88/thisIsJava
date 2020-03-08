package com.study.solid.DIP;

/**
 * DIP (Dependency Inversion Principle) 의존 역전 원칙
 * 추상화 된 것은 구체적인 것에 의존하면 안된다. 구체적인 것이 추상화 된것에 의존해야 한다.
 * 자신보다 변화하기 쉬운것에 의존하지 마라
 * 예를 들어 BMW 자동차는 스노우타이어를 장착하고 있다. 하지만 스노우타이어는 계절의 영향을 받아 겨울이 지나고 다른 타이어로 교체 할 것이다.
 * BMW 가 자신보다 더 변화에 민감한 스노우타이를 의존하고 있다. 이 의존의 방향을 역전 시키자.
 * 변하기 쉬운것에 의존하던것을 추상화 된 인터페이스나 상위클래스를 두어 변화기 쉬운것의 변화에 영향받지 않게 의존 방향을 역전시켰다.
 * 타이어 인터페이스에 의존하면서 직접적으로 스노우 타이어, 일반 타이어에 의존하는것을 피했다.
 */


public class DIPMain {

    public static void main(String[] args) {

        BMW bmw = new BMW();

        SnowTire snowTire = new SnowTire();
        bmw.setTire(snowTire);

        bmw.getTire().run();

        NormalTire normalTire = new NormalTire();
        bmw.setTire(normalTire);

        bmw.getTire().run();

    }
}
