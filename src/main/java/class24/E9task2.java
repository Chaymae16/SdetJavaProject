package class24;

import java.util.ArrayList;

/*
Create an arraylist of cars and retrieve all the values
 using 3 different ways
 */
/*
Create an arrayList of words.
Remove every word that ends with “e”.
 */
public class E9task2 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("remove");
        words.add("chaymae");
        words.add("coffee");
        words.add("hello");
        words.add("water");
        words.add("juice");

       /*
        for (String name:words){// give as exception

            if (name.endsWith("e")){
                words.remove(name);
            }
                 }
        */
        for (int i = 0; i < words.size(); i++) {

            String name=words.get(i);
            if (name.endsWith("e")){
                words.remove(i);
                i--;//index shift the data also shift
            }
        }
        System.out.println(words);

    }
}
