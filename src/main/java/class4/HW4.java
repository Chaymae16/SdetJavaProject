package class4;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the city");
        String city=scanner.next();
        System.out.println("Please enter the temperature in Fahrenheit ");
        int temperature=scanner.nextInt();
        int temperatureC=(temperature-32)*5/9;
        System.out.println("The temperature is the"+city+"is"+temperatureC);
    }
}
