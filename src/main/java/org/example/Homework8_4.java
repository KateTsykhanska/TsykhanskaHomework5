package org.example;

public class Homework8_4 {
    public static int sumWithoutUnlucky13(int[] nums) {
        int sum = 0;
        boolean skip = false;

        for (int i = 0; i < nums.length; i++) {
            if (skip) {
                skip = false;
                continue;
            }
            if (nums[i] == 13) {
                skip = true;
                continue;
            }
            sum += nums[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(sumWithoutUnlucky13(new int[]{1, 2, 2, 1}));
        System.out.println(sumWithoutUnlucky13(new int[]{1, 1}));
        System.out.println(sumWithoutUnlucky13(new int[]{1, 2, 2, 1, 13}));


    }
}

