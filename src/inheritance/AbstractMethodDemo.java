package inheritance;

public abstract class AbstractMethodDemo {

    // a method without method body is called abstract method

    public abstract void demo();

    // a class with minimum one abstract method will be called as abstract class

    public void m1(){

        System.out.println("This is normal method");
    }

    public static void main(String[] args) {
// WE CAN NOT CREATE OBJECT OF ABSTRACT , OBJECT will call abstract
// method and abstract method does not have any code to execute

       // AbstractMethodDemo obj = new AbstractMethodDemo();
       // obj.demo();
    }

}
