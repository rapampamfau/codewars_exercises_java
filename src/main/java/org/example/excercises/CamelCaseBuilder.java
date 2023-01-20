package org.example.excercises;

public class CamelCaseBuilder {
    public static String toCamelCase(String s) {
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if (c == '-') {
                String[] words = s.split("-");
                sb.append(words[0]);
                for (int i = 1; i < words.length; i++) {
                    char[] chars = words[i].toCharArray();
                    chars[0] = Character.toUpperCase(words[i].charAt(0));
                    sb.append(chars);
                }
                break;
            }
            else if (c == '_') {
                String[] words = s.split("_");
                sb.append(words[0]);
                for (int i = 1; i < words.length; i++) {
                    char[] chars = words[i].toCharArray();
                    chars[0] = Character.toUpperCase(words[i].charAt(0));
                    sb.append(chars);
                }
                break;
            }
        }
        return sb.toString();
    }
}
