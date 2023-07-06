package class28;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E7Task {
    public static void main(String[] args) {
        try {
            System.out.println("Pleas Enter int");
            Scanner scanner=new Scanner(System.in);
            scanner.nextInt();
        }catch (InputMismatchException ime){
            System.out.println("InputMismatchException");
        }

    }
}
