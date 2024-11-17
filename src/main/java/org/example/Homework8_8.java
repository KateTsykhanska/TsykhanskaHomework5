package org.example;


public class Homework8_8 {
    public static int countCode(String string) {
        int code = 0;
        int cope = 0;
        int count = 0;

        for (int i = 0; i < string.length() - 2; i++) {
            if (string.charAt(i) == 'c' && string.charAt(i + 1) == 'o' &&
                    (string.charAt(i + 2)) != ' ' && string.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countCode("aaacodebbb"));
        System.out.println(countCode("codexxcode"));
        System.out.println(countCode("cozexxcope"));
    }
}

