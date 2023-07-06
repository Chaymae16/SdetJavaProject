package class10;

public class E5D2Array {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30,40,50},//row
                {20, 50, 65,20},//row
                {102, 54, 60},//row
                {20,55}
        };
        for (int row = 0; row <matrix.length ; row++) {//for how many row
            int[] arr=matrix[row];
            for (int colum = 0; colum <matrix[row].length ; colum++) {//for how many elementsI have
                System.out.print(matrix[row][colum]+" ");
            }
            System.out.println();
            
        }
    }
}
