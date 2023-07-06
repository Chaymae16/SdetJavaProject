package class24;

import java.util.ArrayList;

/*
Create an arrayList of drinks. If any drink has letter
 “a” or “e” replace it with water.
 */
public class E13task3 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Coke");
        names.add("milk");
        names.add("Water");
        names.add("juice");

     /*   for (int i = 0; i < names.size(); i++) {
            String word=names.get(i);
            if(word.contains("e")||word.contains("a")){
                names.set(i,"Water");
            }
        }*/
        /*1
        String word=10>8?"Water":"Milk;
         */

       /*2 names.replaceAll(x-> {
            if(x.contains("a")||x.contains("e")){
                return "Water";
            }else {
                return x;
            }
        });*/

        names.replaceAll(x-> x.contains("a")||x.contains("e")?"water":x);//:x the original data
        System.out.println(names);
    }
}










