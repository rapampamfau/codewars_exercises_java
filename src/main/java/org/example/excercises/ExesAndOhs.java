package org.example.excercises;

public class ExesAndOhs {
    public static boolean getXO (String str) {
        int xCount = 0;
        int oCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'x') {
                xCount++;
            } else if (str.toLowerCase().charAt(i) == 'o') {
                oCount++;
            }
        }

        return xCount == oCount;
    }
}
