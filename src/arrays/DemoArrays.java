package arrays;

import java.lang.reflect.Array;

public class DemoArrays {


    //method

    public void demo(){
        // SYNTAX of  Array : DataType [] variable_name={,,,}

        int [] Intarray= {1,2,3,4,5,6,7,8};

        // advance loop for (Datatype variable : array/collection){}

        for (int i=0;i<Intarray.length;i++){

            System.out.println("Printing value using normal loop " +Intarray[i]);

        }
        for (int var: Intarray){

            System.out.println("inside advance loop "+var);
        }



    }

    public void demoStringArray(){

       // DataType [] variable_name={,,,}

        String [] names={"Raj","Deepak","Mohit","John"};

        // advance loop for (Datatype variable : array/collection){}

        for (String var: names){

            System.out.println("Printing names Array..."+var);
        }
    }

    public void demoDesimalArray(){


        double [] prices={23.4,45.3,55.4,67.8,78.6,12.1};

        for (double var:prices ){
            System.out.println("Printing Prices Array..."+var);

        }
    }

    public static void main(String[] args) {

        DemoArrays object= new DemoArrays();
        object.demo();
        object.demoStringArray();
        object.demoDesimalArray();

    }
}
