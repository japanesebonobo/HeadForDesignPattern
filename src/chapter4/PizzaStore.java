package chapter4;

public abstract class PizzaStore {

<<<<<<< HEAD
    protected abstract Pizza createPizza(String item);
=======
    abstract Pizza createPizza(String item);
>>>>>>> 8fa8d785d98c146f16c7d18ade5fe91ec55d32d0

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
