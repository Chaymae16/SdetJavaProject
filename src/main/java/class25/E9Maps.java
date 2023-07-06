package class25;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class E9Maps {
    public static void main(String[] args) {
        TreeMap<String,Double> makeup=new TreeMap<>();
        makeup.put("Lipstick",100.0);
        makeup.put("BlushOn",68.0);
        makeup.put("EyeLiner",80.0);
        makeup.put("Foundation",120.0);
        makeup.put("Base",25.0);

       Set<String> Keys= makeup.keySet();
        System.out.println(Keys);
      Collection<Double> values= makeup.values();// we can use var
        System.out.println(values);

    }
}
