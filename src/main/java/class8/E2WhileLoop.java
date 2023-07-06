package class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter number  ");
        int number= scanner.nextInt();


        while (number!=-1){
            System.out.println("Hello world");
           number= scanner.nextInt();// if we don't put that infinitive loop not stop

        }
    }
}
