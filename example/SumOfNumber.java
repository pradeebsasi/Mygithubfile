package org.example;

/**
 * this program is to find the sum of 10 numbers.
 * sum of 10 numbers means to add 10 numbers.
 * we will initialize number 10.
 */
public class SumOfNumber {
    public static void main(String[] args) {
        //declaring the variable num,sum and initializing the sum value to
        int num=10,sum=0;
        // create a for loop from 1 till length of the num
        for (int i = 1; i <= num; i++) {
        //Addition of sum and i is happening, i value keeps incrementing and gets added
            sum=sum+i;
        }
        //The sum of 10 numbers will be printed in System.out.println
        System.out.println("sum of 10 numbers is="+sum);

    }
}
