package class9;

public class E6Arrays {
    public static void main(String[] args) {
        int[] numbers={10,50,60,45,100};
        for (int i = 0; i <numbers.length ;i++ ) {//indexes

            if (i%2!=0){
                System.out.println(numbers[i]);
            }

        }

    }
}
