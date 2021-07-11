package class_object;

public class EmployeeWithParameterized {

    // properties

    String name;
    int age;
    int emp_id;
    double salary;

    //parameterized constructor


    public EmployeeWithParameterized(String name, int age, int emp_id, double salary) {
        this.name = name;
        this.age = age;
        this.emp_id = emp_id;
        this.salary = salary;
    }

    public static void main(String[] args) {

        // SYNTAX: classname objectname= new classname(parameters);
        EmployeeWithParameterized object=new EmployeeWithParameterized("Ramesh",23,123,55000.57);

        System.out.println(object.name);
        System.out.println(object.age);
        System.out.println(object.emp_id);
        System.out.println(object.salary);

        EmployeeWithParameterized object1=new EmployeeWithParameterized("Sanjeev",27,223,51000.57);
        System.out.println(object1.name);
        System.out.println(object1.age);
        System.out.println(object1.emp_id);
        System.out.println(object1.salary);

    }




}
