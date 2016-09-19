package bastawesy.patterns.factory.abstractfactory.factories.impl;

import bastawesy.patterns.factory.abstractfactory.factories.PizzaIngredientFactory;
import bastawesy.patterns.factory.ingredients.cheese.Cheese;
import bastawesy.patterns.factory.ingredients.cheese.MozzarellaCheese;
import bastawesy.patterns.factory.ingredients.cheese.ReggianoCheese;
import bastawesy.patterns.factory.ingredients.clams.Clams;
import bastawesy.patterns.factory.ingredients.clams.FreshClams;
import bastawesy.patterns.factory.ingredients.clams.FrozenClams;
import bastawesy.patterns.factory.ingredients.dough.Dough;
import bastawesy.patterns.factory.ingredients.dough.ThickCrustDough;
import bastawesy.patterns.factory.ingredients.dough.ThinCrustDough;
import bastawesy.patterns.factory.ingredients.impl.Pepperoni;
import bastawesy.patterns.factory.ingredients.impl.Veggies;
import bastawesy.patterns.factory.ingredients.sauce.MarinaraSauce;
import bastawesy.patterns.factory.ingredients.sauce.PlumTomatoSauce;
import bastawesy.patterns.factory.ingredients.sauce.Sauce;

/**
 * Created by ahmed.bastawesy on 8/28/2016.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheeze() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
