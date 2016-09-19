package bastawesy.patterns.factory.factorymethod.stores.imp;

import bastawesy.patterns.factory.abstractfactory.factories.impl.ChicagoPizzaIngredientFactory;
import bastawesy.patterns.enums.PizzaType;
import bastawesy.patterns.factory.factorymethod.stores.PizzaStore;
import bastawesy.patterns.factory.pizza.Pizza;
import bastawesy.patterns.factory.pizza.imp.ChicagoStylePizza.ChicagoStyleCheesePizza;
import bastawesy.patterns.factory.pizza.imp.ChicagoStylePizza.ChicagoStyleGreekPizza;
import bastawesy.patterns.factory.pizza.imp.ChicagoStylePizza.ChicagoStylePepperoniPizza;

/**
 * Created by ahmed.bastawesy on 8/24/2016.
 */
public class ChicagoStylePizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;
        ChicagoPizzaIngredientFactory chicagoPizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        if (pizzaType.equals(PizzaType.CHEESE)) {
            pizza = new ChicagoStyleCheesePizza(chicagoPizzaIngredientFactory);
        } else if (pizzaType.equals(PizzaType.GREEK)) {
            pizza = new ChicagoStyleGreekPizza(chicagoPizzaIngredientFactory);
        } else if (pizzaType.equals(PizzaType.PEPPERONI)) {
            pizza = new ChicagoStylePepperoniPizza(chicagoPizzaIngredientFactory);
        }
        return pizza;
    }
}
