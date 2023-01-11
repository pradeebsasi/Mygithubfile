package org.example;

public class Collegestudent {


    public static void main(String[] args) {
        Sdetails s = new Sdetails();
        s.name = "pradeeb";
        s.age = 27;
        s.height = 5.8;

        printMyAgeAndIncrement();

        for (int i = 0; i < 10; i++) {
            System.out.println("the value of i is" + i);

        }

        s.age= printMyAgeAndIncrement(s.age);
        s.age= printMyAgeAndIncrement(s.age);
        s.age= printMyAgeAndIncrement(s.age);
    }

    private static void printMyAgeAndIncrement() {
    }

    private static int printMyAgeAndIncrement(int age) {
        return 0;
    }
}
