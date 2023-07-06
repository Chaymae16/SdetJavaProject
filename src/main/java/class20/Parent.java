package class20;

public class Parent {

    void getMarry(){
        System.out.println("Marry to the girl of our choice");

    }
    private void accessBank(){
        System.out.println("Accessing");
    }
    static void printNumber(){
        System.out.println(10);
    }
}


class Axel extends Parent{

    static void printNumber(){
        System.out.println(20);
    }
    @Override
    void getMarry() {
        System.out.println("I want to marry Karol and want 10 kids");

    }
}




class ParentTester{
    public static void main(String[] args) {
        Axel axel=new Axel();
        axel.getMarry();
        Axel.printNumber();
    }
}
