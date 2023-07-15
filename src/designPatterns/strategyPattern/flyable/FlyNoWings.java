package designPatterns.strategyPattern.flyable;

public class FlyNoWings implements Flyable {

    public void fly() {
        System.out.println("I Can't Fly");
    }
}
