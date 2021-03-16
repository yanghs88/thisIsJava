package com.study.reactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Test {

    public static void main(String[] args) {

//        Flux.just(1,2,3)
//            .doOnNext(integer -> System.out.println("doOnNext = " + integer))
//            .subscribe(integer -> System.out.println("Received = " + integer));

        Mono.just(1)
            .doOnNext(integer -> System.out.println("doOnNext : " + integer))
            .subscribe(integer -> System.out.println("integer = " + integer));

        Flux<Integer> seq = Flux.just(1, 2, 3)
            .doOnNext(i -> System.out.println("doOnNext: " + i));

        System.out.println("시퀀스 생성");
        seq.subscribe(i -> System.out.println("Received: " + i));

    }
}
