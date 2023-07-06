package class26;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Create a map of a building. Store floor number and it is
 associated company name. (Example: 1= Google, 2=Syntax
 etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
 */
public class MapsTask {
    public static void main(String[] args) {
        Map<Integer,String> company=new LinkedHashMap<>();
        company.put(1,"Google");
        company.put(2,"Syntax");
        company.put(3,"Apple");
        company.put(4,"Amazon");
        company.put(5,"Best Buy");
        company.put(6,"Ali Baba");
        company.put(7,"Target");


        System.out.println(company.size());
        company.replace(4,"Youtube");
        company.remove(7);
        System.out.println(company);


    }
}
