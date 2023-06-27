package designPatterns.strategyPattern.duck;

import designPatterns.strategyPattern.flyable.FlyNoWings;

public class duckMain {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        mallardDuck.setFlyable(new FlyNoWings());
        mallardDuck.performFly();


//        mallardDuck.performQuack();
//        mallardDuck.performFly();
    }
}
