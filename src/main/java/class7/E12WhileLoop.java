package class7;

public class E12WhileLoop {
    public static void main(String[] args) {
        // add all the numbers from 1 to 10 and display the result 55
        int num = 1;
        int sum = 0;
        while (num<= 10) {
            sum=sum+num;//same as sum+=num
            num++;

        }
        System.out.println(sum);

    }
}
