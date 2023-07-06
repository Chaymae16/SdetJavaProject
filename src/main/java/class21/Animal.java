package class21;

public class Animal {
    String name;
    String color;
    String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }
    void speak(){
        System.out.println("Animals speak");
    }
    void sleep(){
        System.out.println("Animals sleep from 1 to 20 hours a day ");
    }
    void eat(){
        System.out.println("Animals eat many different things");
    }

}

class Cat extends Animal {
    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("Meow meow....");
    }
    @Override
    void eat(){
        System.out.println("Cats lke to eat Fish");
    }
    @Override
    void sleep(){
        System.out.println("Cats like to sleep 15 hours on Average");
    }
}



 class Dog extends Animal{
    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("woof woof");
    }
    @Override
    void sleep(){
        System.out.println("Dogs sleep 8 hours");
    }
    @Override
     void eat(){
        System.out.println("Dogs like to chew the bones");
    }
    void run(){
        System.out.println("running");
    }
}



class Horse extends Animal{
    public Horse(String name, String color, String breed){
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("neigh neigh");
    }
    @Override
    void eat(){
        System.out.println("Horses like Carrots+ Grass");
    }
    @Override
    void sleep(){
        System.out.println("Horses sleep 2-3 hours");
    }
}

class AnimalTester{
    public static void main(String[] args) {
        Dog dog=new Dog("shaggy","black","German");
        dog.printInfo();
        Animal dog1=new Dog("shady","black","German");
        dog1.printInfo();

        Animal [] animals={new Dog("shady","black","German"),new Cat("Tom","Blue","persian")};
        for (Animal animal:animals){
            animal.printInfo();
        }

    }
}

