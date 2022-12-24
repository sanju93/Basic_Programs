package Recursion;
import java.util.Scanner;

public class Sum_of_N_numbers {

   

    public static int Natural(int n){
        if (n == 1)
        {
            return 1;
        }

        int output = Natural(n-1);
        return n + output;
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to Sum");
        int n = in.nextInt();
        System.out.println("Sum of the N natural Number is: " + Natural(n));
    
        in.close();


        
        
    }
    
}
