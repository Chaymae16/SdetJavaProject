package class30;

public class E4Methods {
    public static void main(String[] args) {
        E4Methods e4Methods=new E4Methods();
        //e4Methods.printHello();
        e4Methods.printWord("Java");


    }

    void printHello(){ //instance methods
        System.out.println("Hello World");

    }
    void printWord(String word){ //passing String data
        System.out.println(word);
        printHello(); // call one methode inside other method ,but not create

    }
}
