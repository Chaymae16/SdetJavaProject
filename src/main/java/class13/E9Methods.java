package class13;

public class E9Methods {

    void printSomething(){
        System.out.println("Hello Java");
        System.out.println("Hello Java");
        System.out.println("Hello Java");
        System.out.println("Hello Java");
    }

    void printWord(String word){
        System.out.println(word);
        System.out.println(word);
        System.out.println(word);
        System.out.println(word);
    }
    void printWorldManyTimes(String word,int number){
        for (int i = 0; i < number; i++) {
            System.out.println(word);

        }
    }

}
