package org.arrays;

/**
 * Hello world!
 */
public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int ary[] = {3, 5, 4, 1};
        System.out.println(missigNumber(ary));

    }

    public static int missigNumber(int[] ary) {
        int aryLength = ary.length+1;
        int sum = aryLength * (aryLength + 1) / 2;
        for (Integer i : ary) {
            sum -= i;
        }
        return sum;
    }
}


