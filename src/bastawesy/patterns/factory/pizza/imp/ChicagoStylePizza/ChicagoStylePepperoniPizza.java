package bastawesy.patterns.factory.pizza.imp.ChicagoStylePizza;

import bastawesy.patterns.factory.abstractfactory.factories.impl.ChicagoPizzaIngredientFactory;
import bastawesy.patterns.factory.pizza.Pizza;

/**
 * Created by ahmed.bastawesy on 8/23/2016.
 */
public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza(ChicagoPizzaIngredientFactory chicagoPizzaIngredientFactory) {
        super(chicagoPizzaIngredientFactory);
    }
}
