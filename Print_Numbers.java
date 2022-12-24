package Recursion;

import java.util.Scanner;

public class Print_Numbers {

    public static void Numbers(int n){
        if (n == 0)
        {
            return;
        }
       
        Numbers(n-1);
        System.out.println(n);
       
    }

    public static void main(String args[]) {

      Scanner in = new Scanner (System.in);

      System.out.println("Enter the number:");
      
      int n = in.nextInt();
      Numbers(n);
      in.close();

    }
    
}
