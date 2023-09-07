package BasicConcept;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        checkList();
    }

    private static void checkList(){
        ArrayList<Integer> list_1 = new ArrayList<Integer>();
        list_1.add(1);
        list_1.add(2);
        list_1.add(3);

        ArrayList<Integer> list_2 = new ArrayList<Integer>();
        list_2.addAll(list_1);

        System.out.println("List 1 : "+list_1.hashCode());
        System.out.println("List 2 : "+list_2.hashCode());


    }
}
