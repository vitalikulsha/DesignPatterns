package Factory.ChicagoPizza;

import Factory.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Shredded Parmesan Cheese");
        toppings.add("Pepperoni");
        toppings.add("Eggplant");
        toppings.add("Spinach");
        toppings.add("Olives ");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
