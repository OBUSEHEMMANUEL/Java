package designPatterns.strategyPattern.flyable;

import designPatterns.strategyPattern.flyable.Flyable;

public class FlyWithWings implements Flyable {
    public void fly(){
        System.out.println("I'M FLYING");
    }
}
