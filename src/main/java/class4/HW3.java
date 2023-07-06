package class4;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Pleas enter your age");

        int age= scanner.nextInt();
        if (age>=18){
            System.out.println("You will get the driver license");
        }else {
            System.out.println("You will get a learner's permit");
        }

    }
}
