package class25;

import java.util.TreeSet;

/*
Create a Set in which you need to add names of the countries.
 In this set we want all objects to be sorted in alphabetical
  order. Using 2 different ways retrieve all elements from set.
 */
public class Task2 {
    public static void main(String[] args) {
        TreeSet<String>names=new TreeSet<>();
        names.add("USA");
        names.add("Morocco");
        names.add("France");
        names.add("France");
        System.out.println(names);

        //2 way
        for (String c:names){
            System.out.println(c);
        }


    }
}
