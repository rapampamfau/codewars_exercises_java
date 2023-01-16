package org.example.excercises;

public class PhoneNumberCreation {
    public static String createPhoneNumber(int[] numbers) {
        String result = "";
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                result += "(" + numbers[i];
            } else if (i == 3) {
                result += ") " + numbers[i];
            } else if (i == 6) {
                result += "-" + numbers[i];
            } else {
                result += numbers[i];
            }
        }
        return result;
    }
}
