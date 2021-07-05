public class LoopsDemo {

    public static void main(String[] args) {

        // SYNTAX :   for ( declaration ; condition ; increment/decrement ){ code }

        for (int i=0; i<10 ; i++){

            System.out.println("Hello  " +i);

        }

        // print table of 2 :  2*1,2*2,2*3,--------

       for (int i=1; i<=10 ; i++){

           System.out.println(2*i);

       }

       // decrement loop

        for (int i=10; i>0 ; i--){

            System.out.println("Hello Decrement Loop:  " +i);

        }

    }
}
