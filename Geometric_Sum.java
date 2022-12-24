package Recursion;

import java.util.Scanner;

/*
 * 1+1/2+ 1/4+1/8+1/16+---------1/2^k
 * K is given by the user 
 * we have to calculate the sum of the series uptp the kth integer series 
 */

public class Geometric_Sum {

    public static double power(int n,int k){
        if (k == 0)
        {
            return 1.00000;
        }

        double output = power(n,k-1);
        return n * output;
    }

    public static double Solution(int k) {
        if (k == 0) {
            return 1.00000;
        }

        double output = Solution(k-1);
        double answer = 1.00000/power(2,k);
        return output + answer; 

    }

    public static void main(String args[]) {
       Scanner in = new Scanner (System.in);
       System.out.println("Enter the integer for the series calculation:");
       int k = in.nextInt();
       System.out.println("Your Answer is: "+ Solution(k));
       in.close(); 
    }


    
}
