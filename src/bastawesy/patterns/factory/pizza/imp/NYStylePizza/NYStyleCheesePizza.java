package bastawesy.patterns.factory.pizza.imp.NYStylePizza;

import bastawesy.patterns.factory.abstractfactory.factories.impl.NYPizzaIngredientFactory;
import bastawesy.patterns.factory.pizza.Pizza;

/**
 * Created by ahmed.bastawesy on 8/23/2016.
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(NYPizzaIngredientFactory nyPizzaIngredientFactory) {
        super(nyPizzaIngredientFactory);
        setName("NY style sauce and cheese");
    }

    @Override
    public void cut() {
        System.out.println("cutting the pizza into diagonal slices");
    }
}
