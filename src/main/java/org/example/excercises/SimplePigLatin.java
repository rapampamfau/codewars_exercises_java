package org.example.excercises;

public class SimplePigLatin {
    public static String pigIt(String str) {
        StringBuilder sb = new StringBuilder();
        String[] strTab = str.split(" ");
        for (String element : strTab) {
            char firstChar = element.charAt(0);
            for (int i = 0; i < element.length(); i++) {
                char actualChar = element.charAt(i);
                if (i != 0) {
                    sb.append(actualChar);
                }

                if (i == element.length() - 1) {
                    sb.append(firstChar);
                    sb.append("ay ");
                }
            }
        }
        return sb.toString();
    }
}
