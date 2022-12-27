package chapter1;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("私は本物のマガモです");
    }
}
