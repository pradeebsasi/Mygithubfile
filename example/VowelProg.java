package org.example;
/**Program to check whether the given character is vowel or not
 * vowels are a,e,i,o,u
 */
//Name of class is VowelProg
public class VowelProg {
    //Main method starts
    public static void main(String[] args) {
        //declaring the variable ch and initializing the value
        char ch = 'e';
        // check if the character ch is equal to the word entered and comparing with all other vowels using pipeline for performing OR operation
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            //this condition is true printing this statement
            System.out.println(ch + " is vowel");
        else
            //this condition is false printing this statement
            System.out.println(ch + " is not a vowel");
        }

    }