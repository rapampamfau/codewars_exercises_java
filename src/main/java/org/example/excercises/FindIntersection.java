package org.example.excercises;

import java.util.Objects;

public class FindIntersection {
    public static String findIntersection(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        String[] str1 = strArr[0].split(",");
        String[] str2 = strArr[1].split(",");
        for (int i = 0; i < strArr[0].length(); i++) {
            for (int j = 0; j < strArr[1].length(); j++) {
                if (Objects.equals(str1[i], str2[j])) {
                    sb.append(str1[i]);
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }
}
