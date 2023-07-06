package class4;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter what is the amount of loan you need");
             int loan=scanner.nextInt();
             if (loan<=200000){
                 System.out.println("You would lend the money");
             }else {
                 System.out.println("You would reject the client");
             }

    }
}
