package class_object;

public class StudentParameterizedConstructor {

// properties
    String name;
    int age;
    String branch;

    // parameterized constructor

    public StudentParameterizedConstructor(String name, int age, String branch) {
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    public static void main(String[] args) {

        // SYNTAX: classname objectname= new classname(parameters);


        StudentParameterizedConstructor object= new StudentParameterizedConstructor("Raj",24,"CS");
        System.out.println(object.name);
        System.out.println(object.age);
        System.out.println(object.branch);

        StudentParameterizedConstructor object1= new StudentParameterizedConstructor("Mukesh",26,"IT");
        System.out.println(object1.name);
        System.out.println(object1.age);
        System.out.println(object1.branch);

        StudentParameterizedConstructor object2= new StudentParameterizedConstructor("Sahil",25,"CS");
        System.out.println(object2.name);
        System.out.println(object2.age);
        System.out.println(object2.branch);
    }


}

