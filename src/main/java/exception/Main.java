package exception;

/**
 * @author Pavel S Varchenko
 * @since 07.05.2018
 */
public class Main {

    public static void main(String[] args) {
        try {
            exTest();

        } catch (IllegalArgumentException e){
            System.out.println("From finally");
        }catch (IllegalStateException e) {
            System.out.println("From try");
        }
    }

    private static void exTest() {
        try {
            throw new IllegalStateException("In try");
        } finally {
            throw new IllegalArgumentException("In finally");
        }
    }
}
