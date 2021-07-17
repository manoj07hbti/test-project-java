package methods;

public class MethodWithInputParams {

    // Syntax : access_specifier return_type  method_name (parameter) {}

    public void greet(String message,int age){

        System.out.println("Hello....." +message+age);
    }

    public void test(int a){

        System.out.println("Hello Test "+a);
    }
    public static void main(String[] args) {
        MethodWithInputParams object =new MethodWithInputParams();
        object.greet("JAVA",25);
        object.test(33);
    }
}
