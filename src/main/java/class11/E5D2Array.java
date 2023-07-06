package class11;

public class E5D2Array {
    public static void main(String[] args) {
        int[][] arr2D = {
                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2},
        };
        // how many even number create variable
        int counter=0;
        for (int i = 0; i <arr2D.length ; i++) {
            for (int j = 0; j <arr2D[1].length ; j++) {
                int num=arr2D[i][j];

                if (num%2==0){
                    counter++;
                }
            }
        }
        System.out.println("counter"+" "+counter);
    }
}
