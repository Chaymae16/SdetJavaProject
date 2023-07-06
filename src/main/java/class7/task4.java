package class7;

public class task4 {
    public static void main(String[] args) {
        int counter = 100;
        System.out.println();
        while (counter>=1) {
// odd numbers when divided by 2 gives 1 as remainder 2/5=reminder 0
            if (counter % 2 == 1) {
                System.out.print(counter + " ");

            }
            counter--;
        }
    }
}