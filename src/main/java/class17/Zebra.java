package class17;

public class Zebra {
    String name;
    String color;
    int age;
    double weight;
static int noOfLegs=4;
    public Zebra(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

   void printInfo(){
       System.out.println(name+" "+color+" "+age+" "+weight);
   }
    static void speak(){//if instance variables not their we can use static
       System.out.println("mooooo boahhhha");
   }
}
