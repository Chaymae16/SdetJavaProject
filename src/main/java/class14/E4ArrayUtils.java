package class14;

public class E4ArrayUtils {

    int add(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
       E4ArrayUtils obj=new E4ArrayUtils();
        int sum =obj.add(10,20);
        System.out.println(sum);

        //System.out.println(obj.add(10,20));

    }

}
