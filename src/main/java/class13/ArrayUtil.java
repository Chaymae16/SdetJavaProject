package class13;

public class ArrayUtil {
    public static void main(String[] args) {
        int [] arr={10,20,45,89};
        int [] arr1={12,32,455,889};
        int[] arr2={129,345,7,987};

        int number=89;
        int number1=10;
        int number2=10;

        ArrayUtil ivana=new ArrayUtil();
        ivana.searchArray(arr,number);
        ivana.searchArray(arr1,number1);
        ivana.searchArray(arr2,number2);

    }
    void searchArray(int[]arr,int number){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==number){
                System.out.println("yes");
                break;
            }
        }
    }
}




