package SolidPrinciples;

import java.awt.*;

//vehicle with engine has only one responsibility
//every kind of vehicle can use calculateSpeed(). which abides by the Interface Segregation principle
//we can define different vehicles with engine, such as car, truck, bus.which demonstrates Open Close principle
//child class car is substitutable for its base class vehicleWithEngine, which demonstrates LSP
//vehicle with engine is not dependent on concrete engine class, which demonstrates Dependency Inversion Principle
public class Client {
    public static void main(String[] args) {
        VehicleWithEngine v = new VehicleWithEngine(new DieselEngine());
        Car car = new Car(new PetrolEngine());


        v.calculateSpeed();
        v = car;
        v.calculateSpeed();
        //child class is substitutable for its base class, which demonstrates LSP

        //demonstration of dependency inversion
        v.startEngine();
        car.startEngine();

    }
}
