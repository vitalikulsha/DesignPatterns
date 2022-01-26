package AbstractFactory.ChicagoPizza;

import AbstractFactory.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Pizza with Clam";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Shredded Parmesan Cheese");
        toppings.add("Clam");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
