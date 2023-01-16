package br.com.dio.desafioreactor;

import java.util.List;

public class App {

    public static void main(String[] args) {
        Question1 question1 = new Question1();
        question1.inc(List.of(1L,3L,22L,55L,123L))
                .doOnNext(System.out::println)
                .subscribe();
    }
}
