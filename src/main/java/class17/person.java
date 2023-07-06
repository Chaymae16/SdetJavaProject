package class17;
//Write a java class that will have a constructor:
// one with parameters and second without any parameters.
// Create a separate Test class where you will execute both of the constructors 1 by 1.
public class person {
    String name;
    person(String Name){
        name=Name;
        System.out.println("1 Argument constructor");
    }
    person(){
        System.out.println("No Argument constructor");
    }

}
