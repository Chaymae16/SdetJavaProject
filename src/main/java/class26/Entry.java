package class26;

public class Entry {
   private String key;
   private double value;

    public Entry(String key, double price) {
        this.key = key;
        this.value = price;
    }
    public String getKey(){
        return key;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';

        // public String toString() { simple approach
        //return key+" value
        //}
    }
}
