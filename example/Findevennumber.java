package org.example;

public class Findevennumber {
    public static void main(String[] args) {
        int n=100;
        System.out.println("display the even numbers:");
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                System.out.println(i + "");
            }
        }
    }
}
