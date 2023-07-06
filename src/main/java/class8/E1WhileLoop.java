package class8;

import java.util.Scanner;

public class E1WhileLoop {
    // to print all the  numbers from starting to 30 ending point
    //ask the user for starting ending (step)


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter starting and the ending point and step");
        int start= scanner.nextInt();
        int end= scanner.nextInt();
        int counter=start;
        while (counter<=end){
            System.out.println(counter+" ");
            counter++;
        }

        }

    }


