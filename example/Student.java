package org.example;

public class Student {
    String name;
    int age;
    String sex;
    public static void main(String[] args) {
        Student j = setDetails("jegan S", 30, "male");
        Student t = setDetails("tamil T", 40, "male");
        Student a = setDetails("aruna G", 50, "female");
        Student m = setDetails("manju A", 60, "female");
        Student[] students = {j,t,a,m};
        for (int i = 0; i < students.length; i++) {
            if (students[i].sex == "male" || students[i].age > 40) {
                printDetails(students[i]);
            }
        }
    }
       static Student setDetails (String name,int age, String sex){
        Student s = new Student();
        s.name = name;
        s.age = age;
        s.sex = sex;
        return s;
    }
    static String getStudentType (Student student,int age){
        if (student.age >=50) {
            return "senior";
        } else if (student.age >=20 && student.age <=40) {
            return "junior";
        } else {
            return "staff";
        }         }
    static void printDetails (Student students) {
        String studentType = getStudentType(students, 50);
        System.out.println(students.name + " is a " + studentType + " student");
    }     }
