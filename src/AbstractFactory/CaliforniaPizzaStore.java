package AbstractFactory;

import AbstractFactory.CaliforniaPizza.CaliforniaStyleCheesePizza;
import AbstractFactory.CaliforniaPizza.CaliforniaStyleClamPizza;
import AbstractFactory.CaliforniaPizza.CaliforniaStylePepperoniPizza;
import AbstractFactory.CaliforniaPizza.CaliforniaStyleVeggiePizza;

public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new CaliforniaStyleCheesePizza();
        } else if ("pepperoni".equals(type)) {
            return new CaliforniaStylePepperoniPizza();
        } else if ("clam".equals(type)) {
            return new CaliforniaStyleClamPizza();
        } else if ("veggie".equals(type)) {
            return new CaliforniaStyleVeggiePizza();
        }
        return null;
    }
}
