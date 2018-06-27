package generics.wildcardvstype;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Pavel S Varchenko
 * @since 07.05.2018
 */
public class Main {


    public static void main(String[] args) {
        Object[] oa = new Object[100];
        Collection<Object> co = new ArrayList<Object>();

        // T inferred to be Object
        fromArrayToCollection(oa, co);

        String[] sa = new String[100];
        Collection<String> cs = new ArrayList<String>();

        // T inferred to be String
        fromArrayToCollection(sa, cs);

        // T inferred to be Object
        fromArrayToCollection(sa, co);

        Integer[] ia = new Integer[100];
        Float[] fa = new Float[100];
        Number[] na = new Number[100];
        Collection<Number> cn = new ArrayList<Number>();

        // T inferred to be Number
        fromArrayToCollection(ia, cn);

        // T inferred to be Number
        fromArrayToCollection(fa, cn);

        // T inferred to be Number
        fromArrayToCollection(na, cn);

        // T inferred to be Object
        fromArrayToCollection(na, co);

        // compile-time error
        //fromArrayToCollection(na, cs);

    }

    static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o); // Correct
        }
    }
}
