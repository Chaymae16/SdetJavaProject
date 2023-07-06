package class15;

import java.util.Arrays;

public class E1 {
    // create a method that takes a number as input call it size.in the method
    // body  create
    // an array of that size. Fill the array with some numbers lets
    //say 10 and returns the array. call the method createArray.
    // createArray(5) => {10,10,10,10,10}
    // createArray(3) => {10,10,10}

     int [] createArray(int size){
         int [] arr=new int[size];
         for (int i = 0; i <size ; i++) {
             arr[i]=10;
         }
         return arr;
     }

    public static void main(String[] args) {

         E1 e1=new E1();
        int[] array = e1.createArray(5);
       // System.out.println(Arrays.toString(array));

       /* for (int i : array) {
            System.out.println(i);
        }*/
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);


        }
    }

    }






