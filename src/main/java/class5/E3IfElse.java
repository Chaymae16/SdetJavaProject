package class5;

import java.util.Scanner;

public class E3IfElse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age= scanner.nextInt();

        if (age<18){

            System.out.println("you can't drive");
        }else {
            System.out.println("you can drive");
        }

    }
}
