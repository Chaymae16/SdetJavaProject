package class25;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/*
How can you remove all duplicates from ArrayList?
List<String> aList=new ArrayList<>();
aList.add("John");
aList.add("Jane");
aList.add("James");
aList.add("Jasmine");
aList.add("Jane");
aList.add("James");
 */
public class task1 {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

       LinkedHashSet<String> names=new LinkedHashSet<>(aList);
        System.out.println(names);
    }
}
