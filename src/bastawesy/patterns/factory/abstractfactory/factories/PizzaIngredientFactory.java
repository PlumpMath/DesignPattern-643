package bastawesy.patterns.factory.abstractfactory.factories;

import bastawesy.patterns.factory.ingredients.cheese.Cheese;
import bastawesy.patterns.factory.ingredients.clams.Clams;
import bastawesy.patterns.factory.ingredients.dough.Dough;
import bastawesy.patterns.factory.ingredients.impl.Pepperoni;
import bastawesy.patterns.factory.ingredients.impl.Veggies;
import bastawesy.patterns.factory.ingredients.sauce.Sauce;

import java.io.Serializable;

/**
 * this is out interface to implement abstract factory pattern
 * Created by ahmed.bastawesy on 8/28/2016.
 */
public interface PizzaIngredientFactory extends Serializable {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheeze();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClams();
}
