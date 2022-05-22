package core.exceptions;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    static void throwException() {
        throw new RuntimeException("пизда");
    }
}
