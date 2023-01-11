package org.example;

/**
 * Program to reverse an array
 * We have to reverse the elements in the array.
 * Array can contain list of numbers or string.
 * The index value of array starts from 0 to n.This is considered as original array.
 * When we reverse the array it should print the array elements in reverse order,
 * that is starting from n to 0 position.
 */
//name of class is ReverseArray
public class ReverseArray {
    //Main method starts
    public static void main(String[] args) {
        //declaring the variable names and initializing the values
        int[] arr = {1, 2, 3, 4, 5};
        //Printing statement
        System.out.println("Original array: ");
        // create a for loop from 0 till length of arr
        for (int i = 0; i < arr.length; i++) {
            //Printing statement
                System.out.print(arr[i] + " ");
            }
        //Printing statement
            System.out.println();
        //Printing statement
            System.out.println("Array in reverse order: ");
        // create a for loop from length of name -1 till 0
        for (int i = arr.length - 1; i >= 0; i--) {
            //Printing statement
                System.out.print(arr[i] + " ");
            }
        }

}
