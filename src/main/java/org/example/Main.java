
package org.example;

public class Main {
    public static int average(int[] nums) {
        int sum = 0;
        int average = 0;
        ;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            average = sum / nums.length;
        }
        return average;
    }

    public static int min(int[] nums) {
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        return min;
    }

    public static int max(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;

    }

    public static void reverse(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(nums[i]);
        }
    }

    public static boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false; 
    }
    public static void main(String[] args) {
        System.out.println("Average: " + average(new int[]{2, 1, 2, 3, 2}));
        System.out.println("Min: " + min(new int[]{2, 1, 2, 3, 2}));
        System.out.println("Max: " + max(new int[]{2, 1, 2, 3, 2}));
        System.out.println("Reverse:");
        reverse(new int[]{2, 1, 2, 3, 2});
        int target = 3;
        int[] nums = new int[]{2, 1, 2, 3, 2};
        boolean result = contains(nums, target);
        if (result) {
            System.out.println("Number " + target + " has been found");
        } else {
            System.out.println("Number " + target + " hasn't been found");
        }
    }
}


