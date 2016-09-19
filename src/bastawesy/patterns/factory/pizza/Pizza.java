package bastawesy.patterns.factory.pizza;

import bastawesy.patterns.factory.abstractfactory.factories.PizzaIngredientFactory;
import bastawesy.patterns.factory.ingredients.cheese.Cheese;
import bastawesy.patterns.factory.ingredients.clams.Clams;
import bastawesy.patterns.factory.ingredients.dough.Dough;
import bastawesy.patterns.factory.ingredients.impl.Pepperoni;
import bastawesy.patterns.factory.ingredients.sauce.Sauce;

import java.io.Serializable;

/**
 * Created by ahmed.bastawesy on 8/23/2016.
 */
public abstract class Pizza implements Serializable {
    private PizzaIngredientFactory pizzaIngredientFactory;
    private String name;
    private Dough dough;
    private Sauce sauce;
    private Cheese cheese;
    private Clams clams;
    private Pepperoni pepperoni;

    public Pizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        this.dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheeze();
        clams = pizzaIngredientFactory.createClams();
        pepperoni = pizzaIngredientFactory.createPepperoni();
    }

    public void bake() {
        System.out.println("Bake for 25 minute");
    }

    public void cut() {
        System.out.println("Cutting the pizza");
    }

    public void box() {
        System.out.println("Place pizza in official pizzabox");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PizzaIngredientFactory getPizzaIngredientFactory() {
        return pizzaIngredientFactory;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public void setClams(Clams clams) {
        this.clams = clams;
    }

    public Clams getClams() {
        return clams;
    }

    public void setPepperoni(Pepperoni pepperoni) {
        this.pepperoni = pepperoni;
    }

    public Pepperoni getPepperoni() {
        return pepperoni;
    }
}
