package class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E3Sets {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Farwa");
        names.add("Farwa");
        System.out.println(names);

        //HashSet does not allow duplicates and does not remember the insertions order random
        HashSet<String>uniqNames= new HashSet<>();
        uniqNames.add("FF");
        uniqNames.add("BB");
        uniqNames.add("AA");
        //There is no get method in set uniqNmae.get(0)
        System.out.println(uniqNames);
        //we can use enha loop but we can't use indexes
    }
}