package class25;

import java.util.TreeSet;

public class E5Sets {
    public static void main(String[] args) {
        TreeSet<String> fruit=new TreeSet<>();
        //no duplicate sort the data by alphabet or numbers
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Banana");
        System.out.println(fruit);
    }
}
