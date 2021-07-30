package inheritance;

public class B extends A {

    public void m3(){

        System.out.println("I am in M3 method of Class B ........");
    }


    public static void main(String[] args) {
        B obj=new B();

        obj.m1();
        obj.m2();
        obj.m3();
    }


}
