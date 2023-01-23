package org.example.motorola;

public class Strings {
    public static int solution(String S) {
        int countB = 0;
        int countA = 0;
        int countN = 0;
        for (char c : S.toCharArray()) {
            if (c == 'B') {
                countB++;
            } else if (c == 'A') {
                countA++;
            } else if (c == 'N') {
                countN++;
            }
        }
        int result = Math.min(countB, countN);
        result = Math.min(result, countA / 3);
        return result;
    }
}
