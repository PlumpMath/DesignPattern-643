package bastawesy.patterns.factory.factorymethod.stores.imp;

import bastawesy.patterns.enums.PizzaType;
import bastawesy.patterns.factory.abstractfactory.factories.impl.NYPizzaIngredientFactory;
import bastawesy.patterns.factory.factorymethod.stores.PizzaStore;
import bastawesy.patterns.factory.pizza.Pizza;
import bastawesy.patterns.factory.pizza.imp.NYStylePizza.NYStyleCheesePizza;
import bastawesy.patterns.factory.pizza.imp.NYStylePizza.NYStyleGreekPizza;
import bastawesy.patterns.factory.pizza.imp.NYStylePizza.NYStylePepperoniPizza;

/**
 * represent the franchiser for  NY
 * Created by ahmed.bastawesy on 8/24/2016.
 */
public class NYStylePizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;
        // creating factory
        NYPizzaIngredientFactory nyPizzaIngredientFactory = new NYPizzaIngredientFactory();
        if (pizzaType.equals(PizzaType.CHEESE)) {
            pizza = new NYStyleCheesePizza(nyPizzaIngredientFactory);
        } else if (pizzaType.equals(PizzaType.GREEK)) {
            pizza = new NYStyleGreekPizza(nyPizzaIngredientFactory);
        } else if (pizzaType.equals(PizzaType.PEPPERONI)) {
            pizza = new NYStylePepperoniPizza(nyPizzaIngredientFactory);
        }
        return pizza;
    }

}
