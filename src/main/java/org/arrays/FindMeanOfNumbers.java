package org.arrays;

import java.util.Scanner;

/*
 * Find the mean of N given numbers.
 * */
public class FindMeanOfNumbers {
    public static void main(String[] args) {
        Scanner sc;
        int noOFElements, sum = 0;
        float  mean;
        System.out.print("Enter number of elements in array : ");
        sc = new Scanner((System.in));
        noOFElements = sc.nextInt();
        int ary[] = new int[noOFElements];
        for (int i = 0; i < noOFElements; i++) {
            System.out.printf("Enter number for ary[%d] = ", i);
            ary[i] = sc.nextInt();
        }
        for (int i = 0; i < noOFElements; i++) {
            sum += ary[i];
        }
        mean = (float)sum / noOFElements;
        System.out.println("Sum = " + sum);
        System.out.println("Mean = " + mean);

    }
}
