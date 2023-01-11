package org.example;

/**
 * program to print prime numbers between 1 to 100.
 * The number which is only divisible by itself and 1 is known as prime number.
 * we should perform modulus operation.
 * if the number gives a reminder as 1 its not a prime number.
 * if the number does not give reminder value then it is prime number.
 */
//creating a class with name as PrimeNumber
public class PrimeNumber {
    //Main method of program starts
    public static void main (String[] args)
        {
            //declaring the variable i and initializing the value to 0
            int i =0;
            //declaring the variable num and initializing the value to 0
            int num =0;
            //declaring the variable primeNumbers and initializing the value to empty
            String  primeNumbers ="";
            // create a for loop from 1 till length of 100
            for (i = 1; i <= 100; i++)
            {
                //declaring the variable counter and initializing the value to 0
                int counter=0;
                // create a for loop from 1 till length of num to be greater than or equal to 1
                for(num =i; num>=1; num--)
                {
                    //create a if statement, its to check if the condition is satisfied and then
                    // the statement inside if block will get executed
                    if(i%num==0)
                    {
                        counter = counter + 1;
                    }
                }
                //create a if statement, its to check if the condition is satisfied and then
                // the statement inside if block will get executed

                if (counter ==2)
                {
                    primeNumbers = primeNumbers + i + " ";
                }
            }
            //Printing statements
            System.out.println("Prime numbers from 1 to 100 are :");
            System.out.println(primeNumbers);

        }
    }





