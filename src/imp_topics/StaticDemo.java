package imp_topics;

/* todo static keyword: can be used by Class reference without creating objects : Compile time binding,
    static will get initialize while class loading (compile time )
    *** static method can not use non static data : non static data object dependent but static can be called by class name only
    *** static method can not be overridden: it will not give you error but there is no meaning of doing it
 */
public class StaticDemo {

    String name="TEST";
    static int data=33;
    final int constant=100;


    public static void demo (){
        System.out.println("I am DEMO METHOD ...");
       // System.out.println(name);
    }


    public static void main(String[] args) {
       // StaticDemo obj =new StaticDemo();
       // obj.demo();

        StaticDemo.demo();// CLassName.MethodName();
        System.out.println(StaticDemo.data);
    }
}
