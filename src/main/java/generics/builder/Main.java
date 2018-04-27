package generics.builder;

import static generics.builder.DodoPizza.Size.LARGE;
import static generics.builder.Pizza.Topping.HAM;
import static generics.builder.Pizza.Topping.ONION;

/**
 * @author Pavel S Varchenko
 * @since 27.04.2018
 */
public class Main {
    public static void main(String[] args) {
        DodoPizza dodoPizza = new DodoPizza.Builder(LARGE)
                .addTopping(HAM)
                .addTopping(ONION)
                .build();

        CalzonePiza calzonePiza = new CalzonePiza.Builder()
                .addTopping(HAM)
                .sauceInside()
                .build();
    }
}
