package class20;
//we have to create 3 animal classes Dog,Cat,horse,
// create 5 methods in each class
//if u want u can create some fields and constructors
// as well.
public class Animals {
    String name;
    String color;
    int age;
    Animals(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    void speak(){
        System.out.println("speaking..");
    }
    void eat(){
        System.out.println("eating...");
    }
    void sleep(){
        System.out.println("ZZZZZZ...");
    }

}
