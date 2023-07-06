package class23;

import java.util.ArrayList;

public class E3Collection {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Moncef");
        names.add("Vlad");
        names.add("Adam");
        names.add("Marina");
        names.add("Axel");
        names.add("Farwa");

        names.remove("Axel");// value
        names.remove(2);// index
        System.out.println(names.indexOf("Marina"));
        //names.clear();
        System.out.println(names);

        for (int i = 0; i <names.size() ; i++) {//loop to get all the elements
            System.out.println(names.get(i));

        }
    }
}
