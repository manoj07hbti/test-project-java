package scanner;

import java.util.Scanner;

public class CalCWithScanner {


    //addition
    public int add(int a,int b){

        int result=a+b;

        return result;
    }
    //sub
    public int sub(int a,int b){

        int result=a-b;

        return result;
    }



    public static void main(String[] args) {

        int choice=0;
        int a=0;
        int b=0;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Welcome to Calculator App , please enter 1 for Addition,2 for Subtraction,3 for multi, and 4 for divide");
        choice=myObj.nextInt();
        System.out.println("Please enter value of a and b");
        a=myObj.nextInt();
        b=myObj.nextInt();

        // create object
        CalCWithScanner obj=new CalCWithScanner();


        if (choice==1){

            // call add method
          int result=  obj.add(a,b);
          System.out.println("ADDITION Output is --"+result);
        }
        else if (choice==2){
            // call sub method
            int result=  obj.sub(a,b);
            System.out.println("SUBTRACTION Output is --"+result);
        }
        else if (choice==3){
            // call multi method
        }
        else {

            // call divide
        }

    }
}
