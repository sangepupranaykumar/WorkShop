package com.bridgelabz;

import java.util.Scanner;
/*
 * Taking the java class of Sum of Digit.
 */
public class SumOfDigit {
    public static void main(String[] args) {
        /*
        * Declaring the variables for the class.
         */
        int digit, number, sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number :");
        number=scanner.nextInt();
        /*
         * Using the loop performing the operation.
         */
        while (number>0){
            digit=number%10;
            sum=sum+digit;
            number=number/10;
        }
        System.out.println("Sum of the digit is :"+sum);
    }
}
