package designPatterns.strategyPattern.duck;

import designPatterns.strategyPattern.flyable.Flyable;
import designPatterns.strategyPattern.quakable.Quackable;

public abstract class Duck{
     Flyable flyable;
     Quackable quackable;

//    public Duck(Flyable flyable, Quackable quackable) {
//        this.flyable = flyable;
//        this.quackable = quackable;
//    }


    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }

    public void performQuack(){
        this.quackable.quack();
    }
    public void swim(){
       System.out.println("All ducks float, even decoys!");
   }
   public void display() {}

  public void performFly() {
      this.flyable.fly();
    }
}
