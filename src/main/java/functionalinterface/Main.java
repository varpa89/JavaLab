package functionalinterface;

import java.util.Random;

/**
 * @author Pavel S Varchenko
 * @since 30.04.2018
 */
public class Main {

//    public static void main(String[] args) {
//
//        Integer someValue = getRandom();
//
//        final String hello = "hello";
//        inCase(someValue != null)
//                .forOddDo()
//                .forEvenDo()
//                .andFinish()
//
//                .checkThat(hello.endsWith("o"))
//                .satisfiedTo(t -> t.booleanValue())
//                .orElse;
//    }
//
//    static CheckingObject inCase(boolean condition) {
//        return new CheckingObject() {
//
//
//            @Override
//            public Processor<EvenOdd, CheckingObject> checkThat(EvenOdd checkingObject) {
//                if(!condition){
//                    return checkingObject;
//                }
//                return null;
//            }
//        };
//    }

    public static enum EvenOdd {
        EVEN, ODD
    }

    private final static EvenOdd[] values = {null, EvenOdd.EVEN, EvenOdd.ODD};

    public static EvenOdd getRandom() {
        int rnd = new Random().nextInt(values.length);
        return values[rnd];
    }

}