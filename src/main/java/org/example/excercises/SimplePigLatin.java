package org.example.excercises;

public class SimplePigLatin {
    public static String pigIt(String str) {
        StringBuilder sb = new StringBuilder();
        String[] strTab = str.split("\\s+");

        for (int j = 0; j < strTab.length; j++) {
            String element = strTab[j];

            if (element.matches("[a-zA-Z]+")) {
                char firstChar = element.charAt(0);
                sb.append(element.substring(1));
                sb.append(firstChar).append("ay");

                if (j != strTab.length - 1) {
                    sb.append(" ");
                }
            } else {
                sb.append(element);

                if (j != strTab.length - 1) {
                    sb.append(" ");
                }
            }
        }

        return sb.toString();
    }
}
