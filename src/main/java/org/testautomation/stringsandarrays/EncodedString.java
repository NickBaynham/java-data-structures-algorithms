package org.testautomation.stringsandarrays;

public class EncodedString {
    public static void main(String[] args) {
        char[] str = {'a', 'b', 'c', ' ', '\t', 'd'};
        char[] result = encodeString(str);
    }

    public static char[] encodeString(char[] str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            if (Character.isWhitespace(str[i])) {
                result.append(SEQUENCE);
            } else {
                result.append(str[i]);
            }
        }
        return null;
    }
    public static final String SEQUENCE = "%20";

}
