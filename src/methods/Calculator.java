package methods;

public class Calculator {

    //add, sub , mul, div

    // Syntax : access_specifier return_type  method_name (parameter) {}

    public void addMethod(){

        System.out.println("This is ADD method of calculator ....");
    }

    public static void main(String[] args) {
        // step 1 and step 2

        Calculator object = new Calculator();
        object.addMethod();
    }

}
