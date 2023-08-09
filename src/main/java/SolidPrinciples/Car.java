package SolidPrinciples;

public class Car extends VehicleWithEngine {

    Car(Engine engine){
        super(engine);
    }
    public void accelarate(){
        System.out.println("Car accelarated");
    }
}
