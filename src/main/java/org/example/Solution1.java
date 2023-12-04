package org.example;

class Solution1 {
    public static int removeElement(int[] nums, int val) {
        boolean flag = true;
        for (int num : nums) {
            if (num != val) {
                flag = false;
                break;
            }
        }
        if (flag) return 0;

        if (nums.length == 1) {
            if (nums[0] == val) return 0;
            else return 1;
        }

        int k = 0;
        int j = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (i > j) break;

            if (nums[i] == val) {
                flag = true;
                while (flag && i < j) {
                    if (nums[j] != val) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        j--;
                        flag = false;
                    } else j--;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) return i;
        }
        return nums.length;
    }

    public static void main(String[] args) {
        /*System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
        System.out.println(removeElement(new int[]{3, 3, 3}, 3));
        System.out.println(removeElement(new int[]{1}, 1));
        System.out.println(removeElement(new int[]{1}, 2));
        System.out.println(removeElement(new int[]{3, 3}, 2));
        System.out.println(removeElement(new int[]{4, 5}, 5));*/
        System.out.println(removeElement(new int[]{3, 3}, 5));
    }
}