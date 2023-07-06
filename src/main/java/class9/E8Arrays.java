package class9;
  // print all the numbers from 6 to 0 in reverse order
        // {'A','B','C','D','E','F'}
       // 6 5 4 3 2 1 0
public class E8Arrays {
    public static void main(String[] args) {
     char []chars= {'A','B','C','D','E','F'};
        for (int i = chars.length-1; i >=0 ; i--) {//-1=5 n0t(-)=6
            System.out.println(i+" " +chars[i]);

        }
    }
}
