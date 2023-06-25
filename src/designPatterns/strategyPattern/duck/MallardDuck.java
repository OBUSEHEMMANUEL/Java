package designPatterns.strategyPattern.duck;

import designPatterns.strategyPattern.flyable.FlyWithWings;
import designPatterns.strategyPattern.quakable.Quack;

public class MallardDuck extends Duck{
//    private Quackable quackable;
//
//    private Flyable flyable;
    public MallardDuck(){
        flyable = new FlyWithWings();
        quackable = new Quack();
    }
//    public void performQuack(){
//        this.quackable.quack();
//    }
//    public void performFly(){
//        this.flyable.fly();
//    }
}
