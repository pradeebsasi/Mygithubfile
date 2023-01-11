package org.example;

import java.util.Scanner;
/**Program to check if the year entered is leap year or not
 * leap year comes once in 4 years
 * leap years contains 366 days
 * If the year is divisible by 4 then it is considered as leap year
 */
//creating a class as LeapYear

public class LeapYear {
    //Main method starts
    public static void main(String[] args){
        //declaring the variable as year
        int year;
        //printing statement
        System.out.println("Enter an Year :: ");
        //Scanner class creates an object of the class
        Scanner sc = new Scanner(System.in);
        //nextInt reads integer value from the user
        year = sc.nextInt();
        // check if the entered year modulus 4 is equal to 0 and entered year
        // modulus 100 is not equal to 0 or entered year modulus 400 is equal to 0
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            //condition is true printing statement
            System.out.println(year+ " is a leap year");
        else
            //condition is false printing statement
            System.out.println(year+ " is not a leap year");
    }
    //Main method ends
}
