package class13;
/*Create a String that should be combination of letters,
 numbers and special characters. Find out how many
 Alphanumeric(abd AZ 284) characters are there in the String
 */
public class task2 {
    public static void main(String[] args) {
        String str="chahtvbAJMHYT@!%G126435";
        String str1=str.replaceAll("[^a-z,A-Z]","");
        System.out.println(str1);
        System.out.println(str1.length());


    }
}
