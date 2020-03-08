package com.study.solid.ISP;

/**
 * ISP (Interface Segregation Principle) 인터페이스 분리 원칙
 * 상황에 맞는 메서드만 제공해라
 * 상위 클래스는 풍성할 수록 인터페이스는 작을수록 좋다.
 */

public class ISPMain {

    public static void main(String[] args) {

        Prayable prayer = new Victor();
        Developable developer = new Victor();

        prayer.pray();
        developer.develop();

    }
}
