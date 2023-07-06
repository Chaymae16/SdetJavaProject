package class14;

public class E6 {
    boolean isEven(int number) {
       boolean isEven = false;

        if (number % 2 == 0) {
            return true;
        }
        return isEven;
        //return number%2==0;
    }

    public static void main(String[] args) {
        E6 obj=new E6();
        System.out.println(obj.isEven(15));
    }

}