package Recursion;

public class PairStars {

    public static String pair(String str) {
        if (str.length() == 1){
            return str;
        }

        String output = pair(str.substring(1));
        if (output.charAt(0) == str.charAt(0)) {
            return str.charAt(0) + "*" + output;
        }else{
            return str.charAt(0) + output;
        }
    }

    public static void main(String args[]) {
        String str = "Saanjaay";
        System.out.print("Updated:"+ pair(str));
    }
    
}
