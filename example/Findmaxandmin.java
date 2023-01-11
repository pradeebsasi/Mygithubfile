package org.example;

import java.util.Arrays;

public class Findmaxandmin {
    public static void main(String[] args) {
        int[] n = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum = sum + n[i];
        }
        double average = sum / n.length;
        System.out.println("average value of the array elements is:" + average);
        findMinAndMax(n);
    }
    private static void findMinAndMax(int[] n) {
        int maximum=n[0];
        int minimum=n[0];
        for (int i = 1; i < n.length; i++) {
            if (n[i] > maximum) {
                maximum=n[i];}
            else if (n[i]<minimum){
                minimum=n[i];
            }

        }
        System.out.println("Maximum number of the array elements is"+maximum);
        System.out.println("Minimum number of the array elements is"+minimum);
    }
}





