package br.com.dio.desafioreactor;

import reactor.core.publisher.Mono;
import java.util.Optional;

public class Question3 {

    /*
    Verifica se o usuário passado é valido, caso seja retorna void, caso contrário deve disparar uma exception
    (para esse desafio vamos considerar que o usário é valido quando ele tem uma senha com mais de 8 caractéres)
     */
    public Mono<Void> userIsValid(final User user){
        return Mono.just(Optional.of(user))
                .filter(u -> u.get().password().length() > 8)
                .switchIfEmpty(Mono.defer(() -> Mono.error(new ExceptionQuestion3())))
                .doOnNext(System.out::println)
                .then();




    }
}
