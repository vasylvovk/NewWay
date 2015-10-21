package org.ua.mk.vasylvovk.hometask01;

/**
 * Created by vasyl on 10/22/15.
 */
public class Task04 {
    public static void main(String... args) {
        int a = Integer.parseInt(args[0]);

        int odds = a % 10;
        int tmp = a / 10;
        int decs = tmp % 10;
        int cents = tmp / 10;


        int res = cents + decs + odds;

        System.out.println(a + "\t>>\t" + cents + " + " + decs + " + " + odds + " = " + res);
    }
}
