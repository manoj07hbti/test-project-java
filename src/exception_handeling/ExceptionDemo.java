package exception_handeling;

/* todo what is difference between Exception and Error ?
        Error can not be handled but we can handle exception properly using try and catch block : OutOfMemory Error can not handle in code
        ******** Parent class of both Throwable
        SYNTAX: try { code ..
                    }
                catch(Exception e) { code for handeling exception and it will get executed whenever exception occured
                   }
               finally{
               THIS will get executed every time ....
               }
          one try block should have at least one catch , it may have many catch block
          https://www.w3schools.com/java/java_try_catch.asp
     Q:  what is final , finally and finalize :
     keyword : throw --> to use throw any exception : throw new Exception();
               throws --> method level
               https://www.javatpoint.com/exception-handling-in-java
     Q:Hierarchy of Exception : Child exception should catch first then parent exception

 */

public class ExceptionDemo {

    public void divide(int a,int b){

        System.out.println("BEFORE DIVIDE METHOD");

      /*  try{
            // code
        }
        catch (Exception e){

        }*/

      try {
          int result=a/b;
      }
      catch (Exception E){
          System.out.println("Exception Occured ..." +E);
      }
      finally {
          System.out.println("I AM FINALLY BLOCK AND I WILL GET EXECUTED EVERY TIME....");
      }

        System.out.println("AFTER DIVIDE ");

    }

    public static void main(String[] args) {

        ExceptionDemo obj = new ExceptionDemo();
        System.out.println("INSIDE MAIN METHOD");
        obj.divide(6,0);
        obj.divide(8,2);
        System.out.println("INSIDE MAIN  after METHOD");


    }
}
