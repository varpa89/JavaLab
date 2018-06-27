package functionalinterface;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Pavel S Varchenko
 * @since 30.04.2018
 */
@FunctionalInterface
public interface Processor<T, V> {
    void processor(Function<T, V> check);
}
