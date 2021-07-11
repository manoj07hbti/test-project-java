package class_object;

public class Student {

    //properties
    String name="Raj";
    int age=24;
    int roll_no=33;
    String specialization="CS";

    public static void main(String[] args) {


        // SYNTAX: ClassName object_name= new ClassName ();

        Student object=new Student();// object created  CONSTRUCTOR

        System.out.println("Name is : " +object.name);
        System.out.println("Age is : " +object.age);
        System.out.println("Roll number is: " +object.roll_no);
        System.out.println("specialization is : " +object.specialization);

        // Employee , Doctor , Mobile
    }



}
