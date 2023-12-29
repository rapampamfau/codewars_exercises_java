package org.example.excercises;

public class BreakCamelCase {

    public static String camelCase(String input) {
        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i != chars.length - 1) {
                char c = chars[i];
                char charNextTo = chars[i + 1];
                result.append(chars[i]);
                if (Character.isLowerCase(c) && Character.isUpperCase(charNextTo)) {
                    result.append(" ");
                }
            } else {
                result.append(chars[i]);
            }
        }
        return result.toString();
    }
}
