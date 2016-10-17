package bastawesy;


import bastawesy.patterns.command.client.RemoteControlLoader;
import bastawesy.patterns.enums.PizzaType;
import bastawesy.patterns.factory.factorymethod.stores.PizzaStore;
import bastawesy.patterns.factory.factorymethod.stores.imp.ChicagoStylePizzaStore;
import bastawesy.patterns.factory.factorymethod.stores.imp.NYStylePizzaStore;
import bastawesy.patterns.factory.pizza.Pizza;
import bastawesy.patterns.singleton.Singleton;

/**
 * Created by ahmed.bastawesy on 8/23/2016.
 * <p>
 * Main class to test calling each implemented design pattern in this project
 * </p>
 */
public class MainClass {

    public static void main(String[] args) {
//        callFactory();
//        callSingleton();
        callCommand();
    }

    /**
     * simulate calling the Factory pattern
     */
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


    /**
     * simulate Calling the Singleton pattern
     */
    private static void callSingleton() {
        Singleton instance = Singleton.getInstanceAttempt1();
    }


    /**
     * simulates calling the Command pattern
     */
    private static void callCommand() {

        /** creates client object */
//        RemoteControlTest remoteControlTest = new RemoteControlTest();
//        /** performs the required actions */
//        remoteControlTest.onButtonClick();

        RemoteControlLoader remoteControlLoader = new RemoteControlLoader();
        remoteControlLoader.load();
    }
}
