package class_object;

public class Laptop {

    // properties

      String brand="HP";
      int ram=8;
      String processor="I5";

    public static void main(String[] args) {

        // how to create object ?
        // SYNTAX: ClassName object_name= new ClassName ();

        Laptop object=new Laptop ();// object created here
        Laptop object1=new Laptop();
        Laptop object2=new Laptop();

        System.out.println(object.brand);
        System.out.println(object.ram);
        System.out.println(object.processor);

        System.out.println("PRINTING OBJECT VALUES:BRAND: " +object.brand);
        System.out.println("PRINTING OBJECT VALUES:RAM: " +object.ram);
        System.out.println("PRINTING OBJECT VALUES:PROCESSOR: "+object.processor);


    }



}
