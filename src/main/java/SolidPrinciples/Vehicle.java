package SolidPrinciples;

public interface Vehicle {
    //every kind of vehicle can use calculateSpeed(). which abides by the Interface Segregation principle
    public void calculateSpeed();
}
