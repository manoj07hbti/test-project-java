package inheritance;

// method overriding will happen only in parent and child methods
public class MethodOverriding extends MethodOverLoading{

// method overriding : same method signature but different method body
// Syntax : access_specifier return_type  function_name (parameter) {}

    public void demo(){

        System.out.println("THIS IS OVERRIDDEN METHOD....");
    }


    public static void main(String[] args) {
        MethodOverriding obj=new MethodOverriding();
       // obj.demo();

        // interview

        MethodOverLoading obj_Parent=new MethodOverLoading();// parent class object
        obj_Parent.demo();

        MethodOverLoading obj_Parent2=new MethodOverriding();

        obj_Parent2.demo();
    }
}
