package org.example;

import java.util.Scanner;
/**
 * /*Program to reverse a number
 * We have to reverse the number.
 * The index value of number starts from 0 to n.This is considered as original number.
 * When we reverse the number it should print the number in reverse order,
 * that is starting from n to 0 position.
 */
//Creating a class with name as ReverseNumber
public class ReverseNumber {
    //Main method starts
    public static void main(String[] args) {
        //declaring the variables num,reversed and initializing the value of num as 1234 and reversed as 0
        int num = 0, reversed = 0;
        System.out.println("Input your number and press enter: ");//printing statement
        Scanner in = new Scanner(System.in);//Scanner class creates an object of the class
        num = in.nextInt();//nextInt reads integer value from the user
        //Creating a while loop in which statements will execute and stops the execution if the loop ends
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        //printing statement
        System.out.println("Reversed Number: " + reversed);
    }
//Main methods ends
}