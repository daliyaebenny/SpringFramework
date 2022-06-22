package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Tight coupling
        System.out.println("Tight coupling with object creation");
        Car car = new Car();
        car.drive();
        Bike bike = new Bike();
        bike.drive();

      // Created vehicle interface to reduce dependency
        System.out.println("Created vehicle interface to reduce dependency");
        Vehicle vehicle = new Bike();
        vehicle.drive();

    }
}
