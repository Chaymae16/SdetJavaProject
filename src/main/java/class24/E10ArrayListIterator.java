package class24;

import java.util.ArrayList;

public class E10ArrayListIterator {
    public static void main(String[] args) {

        ArrayList<String> words=new ArrayList<>();
        words.add("remove");
        words.add("chaymae");
        words.add("coffee");
        words.add("hello");
        words.add("water");
        words.add("juice");

        words.removeIf(x->x.endsWith("e")); //for remove things
    //it's called Lambda expression Java 8, x:variable

/*
        Iterator<String> iterator=words.iterator();

        while (iterator.hasNext()){// boolean
            String name=iterator.next();//actual value from this Arraylist
                if (name.endsWith("e")){
                    iterator.remove();//remove this value
                }

            }
*/
        System.out.println(words);
        }

    }

