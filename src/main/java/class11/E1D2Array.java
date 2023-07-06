package class11;
//print add number
public class E1D2Array {
    public static void main(String[] args) {
        int[][] arr={
                {10,20,30,40,50},
                {1,2,3,4,5},
                {5,5,5,5,5},
                {10,8,6,4,2},
        };

    // print only odd numbers from this 2d array using loop
    //arr[i] => gives me the array at specific index by i
    // int [] innerArray=arr[i]; => innerArray.length
        for (int row = 0; row <arr.length; row++){//how many row outer loop 0,1,2,3
            for (int colm = 0; colm <arr[row].length ; colm++) {//arr[row].length how many element 5 inner loop
                int elemnet=arr[row][colm];
                if (elemnet%2!=0){
                    System.out.println(elemnet);
                }
            }
        }
    }
}
