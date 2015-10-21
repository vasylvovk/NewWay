package org.ua.mk.vasylvovk.hometask01;

/**
 * Created by vasyl on 10/21/15.
 */
public class Task02 {
    public static void main(String... args) {
        int a = Integer.parseInt(args[0]);

        int decs = a / 10;
        int odds = a % 10;

        int res = decs + odds;

        System.out.println(a + "\t>>\t" + decs + " + " + odds + " = " + res);
    }
}
