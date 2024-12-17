package demo.practice;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        int nums[] = {1,1,2};

        int aryLength = nums.length;
        int ary2[] = new int[nums.length];
        Arrays.fill(ary2, Integer.MAX_VALUE);

        ary2[0] = nums[0];

        int ptr1 = 0;
        int ptr2 = 0;
        while (ptr1 < aryLength ) {
            if (nums[ptr1] != ary2[ptr2]) {
                ary2[ptr2 + 1] = nums[ptr1];
                ptr2++;
            }

            ptr1++;
        }
        System.out.println(ptr2+1);
        System.out.println(Arrays.toString(nums));
        nums=ary2;
        System.out.println(Arrays.toString(ary2));
        System.out.println(Arrays.toString(nums));
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
//       [0,0,1,1,1,2,2,3,3,4]
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}