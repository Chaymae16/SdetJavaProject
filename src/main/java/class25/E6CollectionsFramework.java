package class25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class E6CollectionsFramework {
    public static void main(String[] args) {
        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Orange");

        HashSet<String> headset=new HashSet<>(fruit);//remove duplicate elements
        System.out.println(headset);

        LinkedList<String> linkedList=new LinkedList<>(headset);
        System.out.println(linkedList);

    }
}
