package com.study.reactor;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Test2 {

    public static void main(String[] args) {

        Flux<Integer> seq = Flux.just(1,2,3);
        seq.subscribe(new Subscriber<Integer>() {
            private Subscription subscription;

            @Override
            public void onSubscribe(Subscription subscription) {
                System.out.println("Subscriber.onSubscribe");
                this.subscription = subscription;
                this.subscription.request(Long.MAX_VALUE); //publisher 에 데이터 요청
            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("Subscriber.onNext : " + integer);
//                this.subscription.request(1);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.printf("Subscriber.onError :" + throwable.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("Subscriber.onComplete");
            }
        });

    }
}
