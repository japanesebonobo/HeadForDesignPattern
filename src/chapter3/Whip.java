package chapter3;

public class Whip extends CondimentDecorator {
    
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + "、ホイップ";
    }

    public double cost() {
        return beverage.cost() + 0.10;
    }
}
