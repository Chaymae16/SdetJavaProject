package class14;

import java.util.Locale;

public class Task1 {
    /*
    Write code that will take in a String input and check to see
     if it is a palindrome or not.

A palindrome means that the characters are the same
 forwards and backwards, ignoring space
     */
    boolean isPalindrome(String str){
        
        String reversedStr="";
        for (int i =str.length()-1; i >=0 ; i--) {
            reversedStr=reversedStr+str.charAt(i);

        }
        boolean isPalindrome=false;
        if (str.equalsIgnoreCase(reversedStr)){
            isPalindrome=true;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();
        boolean result=task1.isPalindrome("Madam");
        System.out.println(result);
    }

}
    //boolean isPalindromeSB(String str) {
/*
new StringBuilder(str) => converts the String to a StringBuilder
reverse()=> it reverses the contents in StringBuilder
toString()=> it converts the Stringbuilder back to a String
equalsIgnoreCase(str)=> comparing the reversed String to original one
 */
        //return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
