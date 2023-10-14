package org.testautomation.hashtables;

public class Hashing {

    public static String getValue(int key) {
        String [] strings = {
                "I am a programmer, I have no life.",
                "8 bytes walk into a bar, the bartenders asks \"What will it be?\"One of them says, \"Make us a double.\"",
                "Computers are useless. They can only give you answers.\n-Pablo Picasso"
        };

        if (key < strings.length) {
            return strings[key];
        } else {
            System.out.println("Key Not Found!\n");
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println(getValue(1));
    }
}
