package methods;

public class CalCwithInputParams {

    // Syntax : access_specifier return_type  method_name (parameter) {}

    // addition
    public void add(int a, int b){

        int sum=a+b;

        System.out.println("SUM is " +sum);
    }
    //multiplication

    public void multi(int a, int b){
        int result=a*b;
        System.out.println("multiplication is : "+result);
    }

    public static void main(String[] args) {
        CalCwithInputParams object=new CalCwithInputParams();
        object.add(8,9);
        object.add(17,34);
        object.add(443,122);

        object.multi(4,5);
        object.multi(67,34);

    }


}
