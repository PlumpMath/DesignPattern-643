package bastawesy.patterns.factory.pizza.imp.NYStylePizza;

import bastawesy.patterns.factory.abstractfactory.factories.impl.NYPizzaIngredientFactory;
import bastawesy.patterns.factory.pizza.Pizza;

/**
 * Created by ahmed.bastawesy on 8/23/2016.
 */
public class NYStyleGreekPizza extends Pizza {

    public NYStyleGreekPizza(NYPizzaIngredientFactory nyPizzaIngredientFactory) {
        super(nyPizzaIngredientFactory);
    }
}
