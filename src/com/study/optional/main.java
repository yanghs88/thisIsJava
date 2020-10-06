package com.study.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.swing.text.html.Option;
import lombok.ToString;

public class main {

    public static List<Member> memeberList = new ArrayList<>();

    /**
     * 메서드가 반환할 결과값이 ‘없음’을 명백하게 표현할 필요가 있고,
     * null을 반환하면 에러를 유발할 가능성이 높은 상황에서 메서드의 반환 타입으로 Optional을
     * 사용하자는 것이 Optional을 만든 주된 목적이다.
     * Optional 타입의 변수의 값은 절대 null이어서는 안 되며, 항상 Optional 인스턴스를 가리켜야 한다.
     */
    public static void main(String[] args) {


        for(int i=0; i<10; i++) {
            Member memeber = new Member(i, "name"+i);
            memeberList.add(memeber);
        }

        Optional<Member> member = getMember(11);
        Member test50 = member.orElse(new Member(1, "test50"));
        System.out.println("test50 = " + test50.toString());

        memeberList.stream()
            .forEach(s -> System.out.println("member.toString() = " + s.toString()));

    }

    public static Optional<Member> getMember(int index) {
        return Optional.ofNullable(memeberList.get(index));
    }

    @ToString
    public static class Member {
        public Integer id;
        public String name;

        public Member(Integer id, String name) {
            this.id = id;
            this.name = name;
        }
    }
}
