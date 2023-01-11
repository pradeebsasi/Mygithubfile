package org.example;

import java.util.Scanner;
/**Program to reverse string value
 * We have to reverse the string.
 * String can contain set of words with space in between.
 * The index value of string starts from 0 to n.This is considered as original string.
 * When we reverse the string it should print the string elements in reverse order,
 * that is starting from n to 0 position.
 */
//creating a class with name as StringReverse
public class ReverseString {
    //Main method starts
    public static void main(String[] args){
    //declaring the variable str and initializing the values
    String str;
        System.out.println("Enter string value ");//printing statement
    Scanner scr = new Scanner(System.in);//Scanner class creates an object of the class
    str = scr.nextLine();//nextLIne() is used to get the input string that was skipped of the scanner object
        scr.close();//closes the scanner
    String reversed = reverseString(str);//calling the method reverseString
        System.out.println("The reversed string is: " + reversed);//printing statement
}
    //creating a method called as reverseString
    public static String reverseString(String str)
    {
        if (str.isEmpty())//prints next line as empty
            return str; // return str
        //Calling Function Recursively
        // finally return the reversed string
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    //main ends
}


