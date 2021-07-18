package methods;

public class MethodsWithReturnType {

    // Syntax : access_specifier return_type  method_name (parameter) {}

    public String demoString(String input){

        String result="Hello "+input;

        return result;
    }

    public int demoInt(int input){

       int result= input*input;

       return result;
    }

    public static void main(String[] args) {
        MethodsWithReturnType object= new MethodsWithReturnType();

       String result= object.demoString("SUNDAY");
       System.out.println("output is "+result);
       int out= object.demoInt(7);
       System.out.println("Square of input is "+out);
    }

}
