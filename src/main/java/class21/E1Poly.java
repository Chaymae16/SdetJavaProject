package class21;

public class E1Poly {
    public static void main(String[] args) {
    Animal[] animals = {new Dog("Jack", "black", "German"),
            new Cat("Tom", "blue", "Persian"),
            new Horse("kal", "black", "Italian")
    };
    for (Animal animal:animals){
        animal.speak();
        animal.eat();
        animal.sleep();
    }



    Animal dogStoredInAnimal=new Dog("Jack", "black", "German");
    // we must type cast the dogStoredInAnimal back to a dog to call the run method
        //as this run method only exits in the Dog class.
    Dog d = (Dog) dogStoredInAnimal;//typecasting
        d.run();

        // direct way without using a variable
        ((Dog)dogStoredInAnimal).run();

       int num = (int) 10.5;//example typecasting



}
}
