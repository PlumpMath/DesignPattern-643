package bastawesy.patterns.factory.pizza.imp.ChicagoStylePizza;

import bastawesy.patterns.factory.abstractfactory.factories.impl.ChicagoPizzaIngredientFactory;
import bastawesy.patterns.factory.pizza.Pizza;

/**
 * Created by ahmed.bastawesy on 8/23/2016.
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza(ChicagoPizzaIngredientFactory chicagoPizzaIngredientFactory) {
        super(chicagoPizzaIngredientFactory);
        super.setName("Chicago style deep dish cheese pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into Square slices");
    }
}
