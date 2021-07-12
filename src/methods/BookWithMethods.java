package methods;

public class BookWithMethods {

    //properties
    String name;
    int pages;
    String writerName;


    /* todo    Member function or method -- capabilities
            // Syntax : access_specifier return_type  method_name (parameter) {}
             //access_specifier -> public , private , protected, default   THEORY PART
            //return_type   -> output of function :  void : no return type
            //method_name -> can be anything: it should be meaningful
            // parameter ->  input parameter : optional
      */
// method1  read
    // Syntax : access_specifier return_type  method_name (parameter) {}
    public void  readBook(){

       System.out.println("This is read Method.....");
    }

    // method2  write
    public void writeBook() {
        System.out.println("This is write Method.....");
    }


    public static void main(String[] args) {
        //method calling ....

        //step 1 create Object
        //step 2 object.methodName();// calling a method

        BookWithMethods object=new BookWithMethods();// step 1
        object.readBook();// step 2 calling read book method
        object.writeBook();// calling write book method

    }



}
