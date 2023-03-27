package org.example.excercises;

public class DuplicateEncoder {
    public static String encode(String word) {
        String s = word.toLowerCase();
        char[] w = s.toCharArray();
        for (int i = 0; i < w.length; i++) {
            char toCheck = w[i];
            for (int j = 0; j < w.length; j++) {
                if (i != j) {
                    char actualChar = w[j];
                    if (toCheck == actualChar) {
                        s = s.replace(toCheck, ')');
                    }
                }
            }
        }
        for (int i = 0; i < w.length; i++) {
            if (w[i] != ')') {
                s = s.replace(w[i], '(');
            }
        }
        return s;
    }
}
