package com.bridgelabz;
/*
 * Creating the class
 */
public class NonRepeatingElements {
    public static void main(String[] args)  {
        /*
         * Declaring the array Elements.
         */
        int[] array = new int[]{2, 3, 8, 2, 5, 7};
        /*
         * Using loop Performing the operation.C:\Users\sbpra\IdeaProjects\WorkShop\src\com\bridgelabz\NonRepeatingElements.java
         */
        for (int i = 0; i <= array.length; i++) {
            for (int j =i+1; j <= array.length; j++) {
                if (array[i] != array[j]) {
                    System.out.println("The Non Repeating Numbers are :" + array[j]);
                }
            }
        }
    }
}