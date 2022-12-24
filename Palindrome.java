package Recursion;

public class Palindrome {

    public static Boolean Palindrome_check(String str) {
        if (str.length() == 1 || str.length() == 0)
        {
            return true;
        }

        if (str.charAt(0) == str.charAt(str.length()-1)){
            return Palindrome_check(str.substring(1,str.length()-1));
        }
        else{
            return false;
        }
    }

    public static void main(String args[]) {

        String s = "bloodline";
        System.out.println(Palindrome_check(s));

    }
    
}
