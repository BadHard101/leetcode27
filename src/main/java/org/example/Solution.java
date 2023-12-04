package org.example;

class Solution {
    public static int removeElement(int[] nums, int val) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[res] = nums[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
        /*System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
        System.out.println(removeElement(new int[]{3, 3, 3}, 3));
        System.out.println(removeElement(new int[]{1}, 1));
        System.out.println(removeElement(new int[]{1}, 2));
        System.out.println(removeElement(new int[]{3, 3}, 2));
        System.out.println(removeElement(new int[]{4, 5}, 5));
        System.out.println(removeElement(new int[]{3, 3}, 5));*/
    }
}