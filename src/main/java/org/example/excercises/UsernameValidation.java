package org.example.excercises;

public class UsernameValidation {
    public static String usernameValidator(String str) {
        if (checkUsernameLength(str) && checkIfUsernameStartsWithLetter(str) &&
                checkUsernameContent(str) && checkUsernameLastSign(str)) {
            return "true";
        }
        return "false";
    }

    public static boolean checkUsernameLastSign(String str) {
        char[] chars = str.toCharArray();
        Character lastChar = chars[str.length() - 1];
        if (!lastChar.equals('_')) {
            return true;
        }
        return false;
    }

    public static boolean checkUsernameContent(String str) {
        char[] chars = str.toCharArray();
        boolean result = false;
        for (int i = 1; i < str.length(); i++) {
            char ch = chars[i];
            if (Character.isLetterOrDigit(ch)) {
                result = true;
            }
        }
        return result;
    }

    public static boolean checkIfUsernameStartsWithLetter(String str) {
        char[] chars = str.toCharArray();
        if (Character.isLetter(chars[0])) {
            return true;
        }
        return false;
    }

    public static boolean checkUsernameLength(String str) {
        if (!(str.length() > 25 || str.length() < 4)) {
            return true;
        }
        return false;
    }
}
