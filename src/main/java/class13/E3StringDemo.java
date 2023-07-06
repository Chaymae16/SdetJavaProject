package class13;

public class E3StringDemo {
    public static void main(String[] args) {
        String str="KsnhgfdeDRIKGRF1        23454r6@15$&!/^*";

        System.out.println(str.replaceAll("[^a-z]",""));//not replace^
        // don't replace lower case letters from a-z and numbers from 0-9
        System.out.println(str.replaceAll("[^a-z0-9AZ]",""));//not replace^
        System.out.println(str.replaceAll("[Dn3]",""));
        System.out.println(str.replaceAll("[A-Z]","\\$"));//\\work with $
        System.out.println(str.replaceAll(" ","\\$"));
    }
}
