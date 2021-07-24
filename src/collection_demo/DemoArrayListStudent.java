package collection_demo;

import model.Student;

import java.util.ArrayList;

public class DemoArrayListStudent {

    public static void main(String[] args) {


        // maintain student data

        // ArrayList <DataType> OBJ_NAME=new ArrayList  <DataType>();


        ArrayList <Student> studentArrayList = new ArrayList<Student>();

        // create records for student using parameterized constructor

        Student student1=new Student("raj",25,"CS");
        Student student2=new Student("Kamal",22,"IT");
        Student student3=new Student("Mahesh",24,"Mech");
        Student student4=new Student("Ram",24,"CS");

        student4.setName("JAVA");
        student4.setAge(20);
        student4.setBranch("CIVIL");

        // add data to the list
        studentArrayList.add(student1);//0
        studentArrayList.add(student2);//1
        studentArrayList.add(student3);//2
        studentArrayList.add(student4);//3

        // display records or data of students using for each loop

        for (Student var: studentArrayList){

            System.out.println("Printing Name : "+ var.getName());
            System.out.println("Printing Age : "+ var.getAge());
            System.out.println("Printing Branch : "+ var.getBranch());

        }

    }



}
