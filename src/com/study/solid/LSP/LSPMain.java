package com.study.solid.LSP;


/**
 * LSP (Liskov substitution principle) - 리스코브 치환 원칙
 * 상위 타입의 객체를 하위 타입의 객체로 치환해도 상위 타입을 사용하는 프로그램은 정상 동작 해야 한다.
 * 잘못된 상속 관계 : 아버지와 아들 -> 아들은 아버지의 한 종류이다??
 * 올바른 상속 관계 : 포유류와 고래 -> 포유류는 고래의 한 종류이다.
 * 아버지타입클래스 홍길동 = new 아들(); 아들이 태어나 아버지의 행동을 한다???
 * 포유류타입클래스 고래 = new 고래(); 고래가 태어나 포유류의 행동을 한다
 */
public class LSPMain {

    public static void main(String[] args) {

        Coupon coupon = new Coupon();

        Item chocolate = new Item();
        chocolate.setPrice(1000);

        SpecialItem candy = new SpecialItem();
        candy.setPrice(100);


        System.out.println("chocolate = " + coupon.calculateDiscountAmount(chocolate));
        System.out.println("candy = " + coupon.calculateDiscountAmount(candy));


    }
}
