package collection_demo;

import model.Student;

import java.util.HashSet;

public class HashSetWIthStudent {

    public void demo(){
        // HashSet <DataType>  obj_name= new HashSet <DataType> ();

        HashSet<Student>  studentHashSet=new HashSet<Student>();
        Student student1=new Student("raj",25,"CS");
        Student student2=new Student("Kamal",22,"IT");
        Student student3=new Student("Mahesh",24,"Mech");
        Student student4=new Student("Ram",24,"CS");

        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);

        for (Student var: studentHashSet){

            System.out.println(var.getName());
            System.out.println(var.getAge());
            System.out.println(var.getBranch());
        }
    }

    public static void main(String[] args) {

        HashSetWIthStudent obj=new HashSetWIthStudent();
        obj.demo();

    }


}
