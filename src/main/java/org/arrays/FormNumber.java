package org.arrays;

import java.util.Scanner;

/*Form number using N numbers given*/
public class FormNumber {
    public static void main(String[] args) {
        int noOfDigits, number = 0;
        System.out.print("Enter no of digits : ");
        Scanner sc = new Scanner(System.in);
        noOfDigits = sc.nextInt();
        for (int i = 0; i < noOfDigits; i++) {
            System.out.print("Enter number at position " +( i + 1) + ": ");
            int t = sc.nextInt();
            number = (int) (number + t * Math.pow(10, i));
        }
        System.out.println("Number : " + number);
    }
}
