package br.com.dio.desafioreactor;

import java.util.function.Consumer;

public class ExceptionQuestion3 extends RuntimeException implements Consumer<Throwable> {

    public ExceptionQuestion3() {
        super("Password menor ou igual a 8");
    }

    @Override
    public void accept(Throwable throwable) {
        new ExceptionQuestion3();
    }
}
