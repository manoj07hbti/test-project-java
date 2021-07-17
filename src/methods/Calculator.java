package methods;

public class Calculator {

    //add, sub , mul, div

    // Syntax : access_specifier return_type  method_name (parameter) {}
    // addition a+b, multiplication a*b ,divide a/b , sub a-b
    public void addMethod(){
      int a=45;
      int b=43;
      int sum=a+b;

      System.out.println("SUM of a and b is : "+sum);

    }
    public void multiMethod(){

        int a=7;
        int b=4;
        int multi=a*b;
        System.out.println("Muliti of a and b is : "+multi);

    }

    public static void main(String[] args) {
        // step 1 and step 2

        Calculator object = new Calculator();
        object.addMethod();// calling add method
        object.multiMethod();// calling multi method
    }

}
