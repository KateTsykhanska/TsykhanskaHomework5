package org.example;

public class Homework8_2 {
    public static String doubleChars(String str) {
        char[] result = new char[str.length() * 2];
        int i;
        for (i = 0; i < str.length(); i++) {
            result[i * 2] = str.charAt(i);
            result[i * 2 + 1] = str.charAt(i);
        }
        return new String(result);
    }

    public static void main(String[] args) {
        System.out.println(doubleChars("The"));
        System.out.println(doubleChars("AAbb"));
        System.out.println(doubleChars("Hi-There"));
    }
}
