package generics.pecs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Pavel S Varchenko
 * @since 30.04.2018
 */
public class Main {
    public static void main(String[] args) {
        Collection<Shape> shapes = new ArrayList<>();

        shapes.add(new Shape());
        shapes.add(new Square());

        procDest(shapes);
        procSource(shapes);


        Collection<Object> objects = new ArrayList<>();
        procDest(objects);
        //procSource(objects);

        Collection<Square> squares = new ArrayList<>();
        //procDest(squares);
        procSource(squares);



    }

    private static void procSource(Collection<? extends Shape> source) {
        //source.forEach(Shape::test);
        //source.add(new Shape());
    }

    private static void procDest(Collection<? super Shape> dest) {
        dest.add(new Square());
    }
}
