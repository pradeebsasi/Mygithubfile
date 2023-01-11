package org.example;

import java.util.Arrays;

/**
* Considering an array of elements
* Initializing values to the array
* inserting new element into the array
* printing the array elements after adding the new element
 */

//Name of class is InsertArrayElement
public class InsertArrayElements {
        //Main method starts
        public static void main(String[] args)
        {
            //declaring the variable arr[] and initializing the values
            int arr[] = {1,2,3,4,5,6};
            //declaring the variable n and initializing it to array length
            int n = arr.length;
            //creating new variable newArr[] and adding value
            int newArr[] = new int[n+1];
            //declaring the variable value and initializing the value
            int value = 7;
            //printing statement
            System.out.println(Arrays.toString(arr));
            //Create a for loop from 0 to length of n
            for(int i = 0; i<n; i++)
            {
                newArr[i] = arr[i];
            }
            //storing new value
            newArr[n] = value;
            //printing statement
            System.out.println(Arrays.toString(newArr));
        }
        //Main method ends
    }
