package org.example;

public class Homework8_3 {
    public static int sumIgnoreSections(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int sum = 0;
        boolean skip = false;

        for (int i = 0; i < nums.length; i++) {
            if (skip) {
                if (nums[i] == 7) {
                    skip = false;
                }
                    continue;
                }
            if (nums[i] == 6) {
                skip = true;
                continue;
            }
            sum += nums[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(sumIgnoreSections(new int[]{1, 2, 2}));
        System.out.println(sumIgnoreSections(new int[]{1, 2, 2, 6, 99, 99, 7}));
        System.out.println(sumIgnoreSections(new int[]{1, 1, 6, 7, 2}));


    }
}

