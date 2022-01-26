package Factory.NYPizza;

import Factory.Pizza;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        name = "NY Style Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
        toppings.add("Mushrooms");
        toppings.add("Onion");
        toppings.add("Red Pepper");
        toppings.add("Pepperoni");
    }
}
