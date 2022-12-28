package chapter3;

public class SoyMilk extends CondimentDecorator {
    
    public SoyMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + "、豆乳";
    }

    public double cost() {
        if(beverage.getSize() == Size.TALL) {
            return beverage.cost() + 0.10;
        } else if(beverage.getSize() == Size.GRANDE) {
            return beverage.cost() + 0.15;
        } else if(beverage.getSize() == Size.VENTI) {
            return beverage.cost() + 0.20;
        } else {
            return beverage.cost();
        }
    }
}
