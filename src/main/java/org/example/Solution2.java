package org.example;

class Solution2 {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
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