package designPatterns.strategyPattern.quakable;

public class MuteQuack implements Quackable {

    public void quack() {
        System.out.println("Can't Quack");
    }
}
