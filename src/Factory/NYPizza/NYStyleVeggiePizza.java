package Factory.NYPizza;

import Factory.Pizza;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
        toppings.add("Mushrooms");
        toppings.add("Onion");
        toppings.add("Red Pepper");
    }
}
