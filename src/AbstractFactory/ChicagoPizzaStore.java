package AbstractFactory;

import AbstractFactory.ChicagoPizza.ChicagoStyleCheesePizza;
import AbstractFactory.ChicagoPizza.ChicagoStyleClamPizza;
import AbstractFactory.ChicagoPizza.ChicagoStylePepperoniPizza;
import AbstractFactory.ChicagoPizza.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new ChicagoStyleCheesePizza();
        } else if ("pepperoni".equals(type)) {
            return new ChicagoStylePepperoniPizza();
        } else if ("clam".equals(type)) {
            return new ChicagoStyleClamPizza();
        } else if ("veggie".equals(type)) {
            return new ChicagoStyleVeggiePizza();
        }
        return null;
    }
}
