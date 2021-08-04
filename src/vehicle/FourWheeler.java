package vehicle;

public class FourWheeler extends Vehicle {

    @Override
    public void service() {
        System.out.println("THIS IS FOUR WHEELER SERVICE METHOD");
    }

    public static void main(String[] args) {
        FourWheeler obj= new FourWheeler();
        obj.displayInfo();
        obj.service();

    }
}
