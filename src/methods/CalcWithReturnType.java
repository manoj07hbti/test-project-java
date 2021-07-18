package methods;

public class CalcWithReturnType {

    // Syntax : access_specifier return_type  method_name (parameter) {}


    //addition
    public int addition(int a, int b){

        int result=a+b;

     return result;
    }
    //subtraction
    //multi
    //divide

    public static void main(String[] args) {
        CalcWithReturnType object =new CalcWithReturnType();
        int output=object.addition(2,5);// method calling ...... store output of method in a variable of same datatype

        System.out.println("output from addition method is ---"+output);

    }

}
