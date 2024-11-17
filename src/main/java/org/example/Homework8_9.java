package org.example;

public class Homework8_9 {
    public static boolean endsWith(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        return str1.endsWith(str2) || str2.endsWith(str1);
    }

    public static void main(String[] args) {
        System.out.println(endsWith("AbC", "HiaBc"));
        System.out.println(endsWith("abc", "abXabc"));
        System.out.println(endsWith("Hiabc", "abc"));
    }
}
