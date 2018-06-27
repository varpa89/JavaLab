package functionalinterface;

/**
 * @author Pavel S Varchenko
 * @since 30.04.2018
 */
@FunctionalInterface
public interface CheckingObject {
    Processor<Main.EvenOdd, CheckingObject> checkThat(Main.EvenOdd checkingObject);
}
