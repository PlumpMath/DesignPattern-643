package bastawesy.patterns.factory.pizza.imp.ChicagoStylePizza;

import bastawesy.patterns.factory.abstractfactory.factories.impl.ChicagoPizzaIngredientFactory;
import bastawesy.patterns.factory.pizza.Pizza;

/**
 * Created by ahmed.bastawesy on 8/23/2016.
 */
public class ChicagoStyleGreekPizza extends Pizza {
    public ChicagoStyleGreekPizza(ChicagoPizzaIngredientFactory chicagoPizzaIngredientFactory) {
        super(chicagoPizzaIngredientFactory);
    }
}
