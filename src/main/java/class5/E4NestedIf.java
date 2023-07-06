package class5;

import java.util.Scanner;

public class E4NestedIf {
    public static void main(String[] args) {

        int money=5000;
        String day="Monday";
       if (money > 10000){
           if(day.equals("Sunday")){
               System.out.println("Lets go shopping");
           }else {
               System.out.println("Let wait for sunday");
           }

           }else {
           System.out.println("Let's save more");
       }



       }

}


