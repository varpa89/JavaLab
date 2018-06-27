package generics.wildcardvstype;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Pavel S Varchenko
 * @since 06.05.2018
 */
public class Battle<T extends Parent> {


    public static void main(String[] args) {
        Battle<Parent> battle = new Battle<>();


        Collection<Parent> battles = new ArrayList<>();
        battle.typedProcess(battles); //ok
        battle.wildProcess(battles); //ok

        battles.add(new Parent());
        battles.add(new Child());

        unknownCollection(battles);
        //objectCollection(battles);// not compile

        //////////

        Collection<Parent> battles2 = new ArrayList<>();
        //Collection<Child>childs = battles2;// not compile
        Collection<? extends Parent> childs = battles2;//ok


        //////////
        Collection<? super Child> battles3 = new ArrayList<>();
        //Collection<Parent> parents = battles3;// not compile

    }

    void wildProcess(Collection<? extends Parent> data) {
        // data.add(new Child());// not compile©
    }

    void typedProcess(Collection<Parent> data) {

    }

    void superProcess(Collection<? super Parent> data) {
        data.add(new Parent());
        data.add(new Child());
        //data.add(new SuperParent());//not compile
        //data.add(new Object());//not compile
    }

    static void unknownCollection(Collection<?> data) {

    }

    static void objectCollection(Collection<Object> data) {

    }
}
