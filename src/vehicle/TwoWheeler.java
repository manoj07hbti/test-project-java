package vehicle;

public class TwoWheeler extends Vehicle {



    public void service() {
        System.out.println("THIS IS TWO WHEELER SERVICE METHOD");
    }

    public static void main(String[] args) {
        TwoWheeler obj= new TwoWheeler();
        obj.displayInfo();
        obj.service();


    }


}
