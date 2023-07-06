package class26;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
Create a map of countries with its capital that will
 store countries in alphabetical order.
Print all keys and values from a country map using
for each loop .
Print all values from a country map using for each
 loop and iterator.
 */
public class MapTask2 {
    public static void main(String[] args) {
        Map<String,String> countries=new TreeMap<>();
        countries.put("USA","Washington");
        countries.put("Pakistan","Islamabad");
        countries.put("India","New Dehli");
        countries.put("Canada","Toronto");
        countries.put("Italy","Rome");

        Set<String> countrySet=countries.keySet();
        for (String c:countries.keySet()) {
            System.out.println(c);
        }
        System.out.println("*******************");
        for (String v:countries.values()){
            System.out.println(v);
        }
        System.out.println("****************");
        //we can use var var e:countries.entrySet()
        for (Map.Entry<String,String>e:countries.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }





    }
}
