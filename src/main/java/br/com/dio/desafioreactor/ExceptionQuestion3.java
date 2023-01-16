package br.com.dio.desafioreactor;

import java.util.function.Consumer;
import java.util.function.Function;

public class ExceptionQuestion3 extends RuntimeException {

    public ExceptionQuestion3() {
        super("Password menor ou igual a 8");
    }
}
