package class25;

import java.util.LinkedHashSet;

/*
Create a Set of cities in which you want to make sure that
 insertion order is maintained. Then remove any city that starts
  with “A”;
 */
public class Task3 {
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Bombay");
        cities.add("DElhi");
        cities.add("Apna");
        cities.add("Alaska");

        cities.removeIf(x->x.startsWith("A"));
        System.out.println(cities);
    }
}
