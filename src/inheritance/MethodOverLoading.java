package inheritance;

public class MethodOverLoading {

    // method

    public void demo(){

        System.out.println("This is demo method from Parent");
    }

    // Method overloading same method name but different parameter

    public void demo(int a){

        System.out.println("This is overloaded  method "+a );
    }
    // again overload same method

    public void demo(int a,int b){

        System.out.println("This is overloaded second time  method "+a +b );
    }


    public static void main(String[] args) {
        MethodOverLoading obj=new MethodOverLoading();

        obj.demo();
        obj.demo(3);
        obj.demo(2,3);
    }


}
