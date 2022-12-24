package Recursion;

public class String_to_Integer {

    public static int Into_Integer(String str) {
        if (str.length() == 1){
            return str.charAt(0) - '0';
        }

        int output = Into_Integer(str.substring(1));
        int ans = output * 10 + str.charAt(0) - '0';
        return ans;
    }

    public static void main(String args[]){
        String str = "1200034";
        int ans = Into_Integer(str);
        int rev = 0;
        while (ans != 0)
        {
            int rem = ans % 10;
            rev = rev * 10 + rem;
            ans = ans / 10;

        }
        System.out.println(rev);

    }
    
}
