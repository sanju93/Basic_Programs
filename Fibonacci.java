package Recursion;

import java.util.Scanner;

public class Fibonacci {

    public static int fibb(int n)
    {
        if (n == 1 || n == 2){
            return 1;
        }

        int output_1 = fibb(n-1);
        int output_2 = fibb(n-2);
        
        return output_1 + output_2;
    }

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        // if you want to find the series of fibbonacci Numbr till Nth place 
        for (int i = 1;i <= n;i++)
        System.out.print(fibb(i)+ " ");

        in.close();
        

    }
    
}
