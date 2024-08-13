package main.bootcamp_string;

import java.util.Locale;

public class Deneme {
    public static void main(String[] args) {
        String str="HelloWorld";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str.charAt(3));
        System.out.println(str.contains("World"));
        System.out.println(str.substring(3,7));
        System.out.println(str.substring(3));
        System.out.println(str.concat("FEYZA"));
    }
}
