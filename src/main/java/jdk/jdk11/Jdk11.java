package jdk.jdk11;

import java.math.BigDecimal;
import java.util.function.Consumer;

public class Jdk11 {
    public static void main(String[] args) {

        //strings
        var chant = "  USA!!!  ";
        System.out.println("chant.repeat(3) = " + chant.repeat(3));
        System.out.println("chant.isBlank() = " + chant.isBlank());
        System.out.println("chant.strip() = " + chant.strip());

        //lambdas
        //с помощью var можно использовть аннотоции
        Consumer<BigDecimal> moneyConsumer = (@Deprecated var money) ->
                System.out.println("I got this such money! = " + money);

        //http client

    }
}
