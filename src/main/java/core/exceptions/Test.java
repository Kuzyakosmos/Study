package core.exceptions;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            throwError();
        } catch (Error er) {
            System.out.println(er.getMessage());
        }

//        throw new RuntimeException("Сорян");
    }

    static void throwException() {
        throw new MyException("Исключение");
    }

    static void throwError() {
        throw new MyError("Ошибка");
    }
}
