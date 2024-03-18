package code.leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int ary[] = {2,5,5,11}, taget = 10;
        int[] result = twoSum(ary, taget);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length ; i++) {
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return res;
    }
}
