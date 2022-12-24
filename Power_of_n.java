package Recursion;

import java.util.Scanner;

public class Power_of_n {

    public static int power(int n,int x){
        if (x == 0)
        {
            return 1;
        }

        int output = power(n,x-1);
        return n * output;


    }
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number that you want to find the power");
        int n = in.nextInt();
        System.out.println("enter the number power");
        int x = in.nextInt();
        System.out.println(power(n,x));
        in.close();

    }
}
