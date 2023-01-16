package br.com.dio.desafioreactor;

import java.util.List;

public class App {

    public static void main(String[] args) {
        System.out.println("1) Recebe uma lista de longs, incrementa 1 nos valores e retorna um flux dos resultados");
        Question1 question1 = new Question1();
        question1.inc(List.of(1L,3L,22L,55L,123L))
                .doOnNext(System.out::println)
                .subscribe();
        System.out.println("======================================");

        System.out.println("2) Recebe uma lista de usuários e retorna a quantos usuários admin tem na lista");

        User user1 = new User(1l,"greg","greg@gmail.com","1234",true);
        User user2 = new User(1l,"joao","joao@gmail.com","1235",false);
        User user3 = new User(1l,"gabriel","gabriel@gmail.com","1236",true);
        User user4 = new User(1l,"luisa","luisa@gmail.com","1237",false);
        User user5 = new User(1l,"amanda","amanda@gmail.com","1238",true);
        User user6 = new User(1l,"francisco","francisco@gmail.com","1239",true);
        User user7 = new User(1l,"eliane","eliane@gmail.com","1230",false);

        Question2 question2 = new Question2();
        question2.countAdmins(List.of(user1,user2,user3,user4,user5,user6,user7))
                .doOnNext(System.out::println)
                .subscribe();

    }
}
