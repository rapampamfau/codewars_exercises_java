package org.example.excercises;

public class StringReverse {
    public static String firstReverse(String str) {
        char[] ch = str.toCharArray();
        String result = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            char d = ch[i];
            result += d;
        }
        return result;
    }
}
