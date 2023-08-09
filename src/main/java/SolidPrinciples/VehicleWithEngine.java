package SolidPrinciples;

public class VehicleWithEngine implements Vehicle{
    //this class has only one responsibility
    //we can define different vehicles with engine, such as car, truck, bus.
    //which demonstrates Open Close principle

    private Engine engine;
    //dependency inversion principle, as this class is not dependent
    // on  concrete engine class

    public VehicleWithEngine(Engine engine){
        this.engine = engine;
    }

    @Override
    public void calculateSpeed() {
        System.out.println("Vehicle speed calculated");
    }

    public void startEngine(){
        this.engine.start();
    }

    public void stopEngine(){
        this.engine.stop();
    }

}
