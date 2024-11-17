package org.example;

public class Homework8_7 {
    public static int countHi(String hi) {
        int count = 0;

        for (int i = 0; i < hi.length(); i++) {
            if (hi.charAt(i) == 'h' && hi.charAt(i + 1) == 'i')
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countHi("abc hi ho"));
        System.out.println(countHi("ABChi hi"));
        System.out.println(countHi("hihi"));
    }
}
