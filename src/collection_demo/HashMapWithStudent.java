package collection_demo;

import model.Student;

import java.util.HashMap;

public class HashMapWithStudent {


    public void demo(){

        //Syntax:   HashMap <Key_DataType,Value_DataType> objName= new HashMap <Key_DataType,Value_DataType> ();

        // key as integer , Student as Value

        HashMap <Integer, Student>  studentHashMap= new HashMap<>();

        Student student1=new Student("Raj",23,"CS");
        Student student2=new Student("Mukesh",24,"IT");
        Student student3=new Student("Rajesh",25,"CS");

        // adding elements to hashmap using PUT

        studentHashMap.put(1,student1);
        studentHashMap.put(2,student2);
        studentHashMap.put(3,student3);

        // GET method

        Student var=studentHashMap.get(1);
        System.out.println( var.getName() + " " +var.getBranch()+" "+var.getAge());

         var=studentHashMap.get(2);
        System.out.println( var.getName() + " " +var.getBranch()+" "+var.getAge());
         var=studentHashMap.get(3);
        System.out.println( var.getName() + " " +var.getBranch()+" "+var.getAge());


    }

    public static void main(String[] args) {
        HashMapWithStudent obj=new HashMapWithStudent();
        obj.demo();
    }


}
