package class9;

public class E7Arrays {
    public static void main(String[] args) {


        boolean[] falgs = {true, false, true, false, false, true};
        int counter=0;
        for (int i = 0; i <falgs.length; i++) {
            if (!falgs[i] ) {
                //System.out.println(falgs[i]);
                counter++;

            }
        }
        System.out.println(counter);
        }
    }

