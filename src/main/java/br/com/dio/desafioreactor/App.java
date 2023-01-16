package br.com.dio.desafioreactor;

import java.util.List;

public class App {

    public static void main(String[] args) {
        System.out.println("1) Recebe uma lista de longs, incrementa 1 nos valores e retorna um flux dos resultados");

        Question1 question1 = new Question1();
        question1.inc(List.of(1L,3L,22L,55L,123L))
                .subscribe();

        System.out.println("======================================");

        System.out.println("2) Recebe uma lista de usuários e retorna a quantos usuários admin tem na lista");

        User user1 = new User(1l,"greg","greg@gmail.com","1234323212",true);
        User user2 = new User(2l,"joao","joao@gmail.com","1235",false);
        User user3 = new User(3l,"gabriel","gabriel@gmail.com","1236",true);
        User user4 = new User(4l,"luisa","luisa@gmail.com","1237",false);
        User user5 = new User(5l,"amanda","amanda@gmail.com","1238",true);
        User user6 = new User(6l,"francisco","francisco@gmail.com","1239",true);
        User user7 = new User(7l,"eliane","eliane@gmail.com","1230",false);

        Question2 question2 = new Question2();
        question2.countAdmins(List.of(user1,user2,user3,user4,user5,user6,user7))
                .subscribe();

        System.out.println("======================================");

        System.out.println("3) Verifica se o usuário passado é valido, caso seja retorna void,\n caso contrário deve disparar uma exception" +
                "    (para esse desafio vamos considerar que \n o usário é valido quando ele tem uma senha com mais de 8 caractéres)");

        Question3 q3Test1 = new Question3();
        q3Test1.userIsValid(user1)
                .subscribe();

//        Question3 q3Test2 = new Question3();
//        q3Test2.userIsValid(user2)
//                .subscribe();


    }
}
