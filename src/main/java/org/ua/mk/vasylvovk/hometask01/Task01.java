package org.ua.mk.vasylvovk.hometask01;

/**
 * Created by vasyl on 10/21/15.
 */
public class Task01 {
    public static void main(String... args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int res = a / b;
        int rest = a % b;

        System.out.println(a+" / "+b+" = "+res+" and "+rest + " as rest");
    }
}
