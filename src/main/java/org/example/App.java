package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        //Tight coupling
//        System.out.println("Tight coupling with object creation");
//        Car car = new Car();
//        car.drive();
//        Bike bike = new Bike();
//        bike.drive();
//
//        // Created vehicle interface to reduce dependency
//        System.out.println("Created vehicle interface to reduce dependency");
//        Vehicle vehicle = new Bike();
//        vehicle.drive();
        //simple bean (non-parametrized) bean creation
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Vehicle vehicle = (Vehicle) context.getBean("Vehicle");
        vehicle.drive();

    }
}
