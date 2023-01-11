package org.example;

public class Printmultiplesix {
    public static void main(String[] args) {
        int n=100;
        System.out.println("print multiple six:");
        for (int i = 1; i < n; i++) {
            if(i%6==0){
                System.out.println(i+"");
            }

        }
    }
}
