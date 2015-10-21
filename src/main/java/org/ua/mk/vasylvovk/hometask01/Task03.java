package org.ua.mk.vasylvovk.hometask01;

/**
 * Created by vasyl on 10/22/15.
 */
public class Task03 {
    public static void main(String... args) {
        double a = Double.parseDouble(args[0]);

        double tmp = a - (long) (a + 1);

        System.out.println(tmp);

    }
}
