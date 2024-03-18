package org.arrays;

import java.util.Scanner;

/*
 * Find array of integer contains duplicate numbers
 * */
public class DuplicateNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, ary[];
        boolean flag = false;
        System.out.print("Enter array size : ");
        size = sc.nextInt();
        ary = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter ary[" + i + "]=");
            ary[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if (ary[i] == ary[j] && i != j) {
                    System.out.println("Duplicate element fount at " + i + " and " + j + " num is " + ary[i]);
                    flag = true;
                }
            }
        }
        if(!flag){
            System.out.println("No Duplicate found");
        }
    }


}
