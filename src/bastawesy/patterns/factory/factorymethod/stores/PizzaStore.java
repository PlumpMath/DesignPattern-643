package bastawesy.patterns.factory.factorymethod.stores;

import bastawesy.patterns.enums.PizzaType;
import bastawesy.patterns.factory.pizza.Pizza;

import java.io.Serializable;

/**
 * used to implement factory design patten
 * Created by ahmed.bastawesy on 8/23/2016.
 */
public abstract class PizzaStore implements Serializable {



    public final Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza = createPizza(pizzaType);
        // start of the code that stay and don't change
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        // end of the code that stay and don't change

        return pizza;
    }

    /**
     * represent factory method to be implemented in subclasses
     * @param pizzaType
     * @return
     */
    protected abstract Pizza createPizza(PizzaType pizzaType);

}
