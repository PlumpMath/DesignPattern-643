package bastawesy;


import bastawesy.patterns.enums.PizzaType;
import bastawesy.patterns.factory.factorymethod.stores.PizzaStore;
import bastawesy.patterns.factory.factorymethod.stores.imp.ChicagoStylePizzaStore;
import bastawesy.patterns.factory.factorymethod.stores.imp.NYStylePizzaStore;
import bastawesy.patterns.factory.pizza.Pizza;
import bastawesy.patterns.singleton.Singleton;

/**
 * Created by ahmed.bastawesy on 8/23/2016.
 */
public class MainClass {

    public static void main(String[] args) {
//        callFactory();
        callSingleton();
    }

    private static void callFactory() {
        PizzaStore nYPizzaStore;
        PizzaStore chicagoPizzaStore;

        nYPizzaStore = new NYStylePizzaStore();
        Pizza nYCheesePizza = nYPizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ethan ordered a" + nYCheesePizza.getName());
        System.out.println();


        chicagoPizzaStore = new ChicagoStylePizzaStore();
        Pizza chicagoCheesePizza = chicagoPizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Joel ordered a" + chicagoCheesePizza.getName());
    }


    private static void callSingleton(){
        Singleton instance = Singleton.getInstanceAttempt1();
    }
}
