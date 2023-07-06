package class26;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
Create a map of Best Buy store. Place
item id and item name into it.
Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map
using EntrySet.
 */
public class MapsTask3 {
    public static void main(String[] args) {
        Map<Integer,String> item=new LinkedHashMap<>();
        item.put(7664847,"printer");
        item.put(5680378,"printer");
        item.put(936217,"printer");
        item.put(2645657,"printer");

       Set<Map.Entry<Integer,String>> entrySet =item.entrySet();
       for (var e:entrySet){
           System.out.println(e.getKey()+"= "+e.getValue());
       }


    }
}
