package org.example.excercises;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String str = String.valueOf(num);
        int[] tab = new int[str.length()];
        int result = 0;
        for (int i = 0; i < tab.length; i++) {
            tab[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                int currentInt = tab[i];
                int minInt = tab[j];
                if (currentInt > minInt) {
                    int temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
            }
        }
        String resultStr = "";
        for (int i = 0; i < tab.length; i++) {
            resultStr += tab[i];
            result = Integer.parseInt(resultStr);
        }
        return result;
    }
}
