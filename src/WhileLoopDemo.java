public class WhileLoopDemo {

    public static void main(String[] args) {

        // WHILE loop SYNTAX :  while (condition){ CODE }
        int i=0;

        while( i < 10){

          System.out.println("Hello....." +i);

          i++;
        }

        // Do while Syntax:  do {
             // code block to be executed }
        //while (condition);
        int j=0;
        do {
            System.out.println("Inside do block ......" +j);
            j++;
           }
        while (j<5);

    }
}
