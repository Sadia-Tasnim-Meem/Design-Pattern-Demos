package SolidPrinciples;

public class DieselEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Diesel Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Diesel Engine Stopped");
    }
}
