package chapter4;

<<<<<<< HEAD
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
=======
public class NYPizzaIngredientFactory implements PizzzaIngradientFactory {
>>>>>>> 8fa8d785d98c146f16c7d18ade5fe91ec55d32d0
    
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies[] veggies = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
