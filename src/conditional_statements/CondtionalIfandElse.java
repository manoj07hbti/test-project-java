package conditional_statements;

public class CondtionalIfandElse {

    public static void main(String[] args) {

        /* SYNTAX: if (CONDITIONS){
                        CODE
                        }
                   else
                     {
                         CODE
                     }*/

        int age=6;

        if (age>18 ){

            System.out.println("Person is YOUNG ...");
        }
        else{
            System.out.println("Person is KID");
        }

        String city="DELHI";

        if(city=="AGRA"){
            System.out.println("YOu are in AGRA");
        }
        else {
            System.out.println("YOu are not in AGRA, you are in another City");
        }

        double price=523.5;

        if(price<500){
            System.out.println("Price is lower than 500....");
        }
        else {
            System.out.println("Price is greater than 500....");
        }


    }

}
