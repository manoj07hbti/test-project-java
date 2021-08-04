package vehicle;

public abstract class Vehicle {

    int engineNumber=23232;
    int milage=23;
    double price=32543545;
    String brand="TATA";


// vehicle method

    public void displayInfo( ){

        System.out.println("Vehicle Details " +brand + " "+price );
    }

    // abstract method

    public abstract void service();

}
