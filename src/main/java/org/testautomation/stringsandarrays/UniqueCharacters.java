package org.testautomation.stringsandarrays;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {
    public static void main(String[] args) {
        String check1 = "abcde";
        System.out.println(isUnique(check1));
        System.out.println(isUnique2(check1));
        System.out.println(isUnique3(check1));
        System.out.println(isUnique4(check1));

        String check2 = "abcdefe";
        System.out.println(isUnique(check2));
        System.out.println(isUnique(check2));
        System.out.println(isUnique3(check2));
        System.out.println(isUnique4(check2));
    }

    public static boolean isUnique(String string) {
        char[] chars = new char[string.length()];
        boolean result = true;
        for (int i = 0; i < string.length(); i++) {
            char nextChar = string.charAt(i);
            if (isIncluded(chars, nextChar)) {
                result = false;
                break;
            } else {
                chars[i] = nextChar;
            }
            chars[i] = string.charAt(i);
        }
        return result;
    }

    public static boolean isIncluded(char[] chars, char aChar) {
        boolean result = false;
        for (char c : chars) {
            if (c == aChar) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean isUnique2(String str) {
        Map<Character, Boolean> chars = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.codePointAt(i) <= MAX_CODE) {
                char ch = str.charAt(i);
                if (!Character.isWhitespace(ch)) {
                    if (chars.put(ch, true) != null) {
                        return false;
                    }
                }
            } else {
                System.out.println("The given string contains invalid characters.");
                return false;
            }
        }
        return true;
    }

    private static final int MAX_CODE = 65535;
    private static final char A_CHAR = 'a';

    public static boolean isUnique3(String str) {
        Map<Character, Boolean> chars = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.codePointAt(i) <= MAX_CODE) {
                char ch = str.charAt(i);
                if (Character.isAlphabetic(ch) && Character.isLowerCase(ch)) {
                    if (chars.put(ch, true) != null) {
                        return false;
                    }
                }
            } else {
                System.out.println("The given string contains invalid characters.");
                return false;
            }
        }
        return true;
    }

    public static boolean isUnique4(String str) {
        int marker = 0;
        for (int i = 0; i < str.length(); i++) {
            int s = str.charAt(i) - A_CHAR;
            int mask = 1 << s;
            if ((marker & mask) > 0) {
                return false;
            }
            marker = marker | mask;
        }
        return true;
    }
}
