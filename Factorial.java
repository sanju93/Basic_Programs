package Recursion;
import java.util.Scanner;

// we are using the PMI (principle mathematical induction like maths) Recursion is similar Like that
   // 1. base case                like n = 1 to verify the condition 
   // 2. Induction Hypothesis     assumming true whatever you make our calling function to call (n-1)
   // 3. Induction Step           And manipulate these values coming from the base condition  or making the N



public class Factorial {

    public static int Fact(int num){
                                     // 1. base case 

        if (num == 1 || num == 0)
        {
            return 1;
        }

        int output = Fact(num - 1); //2. Induction hypothesis
        return num * output;        //3. Induction step

    }

    public static void main(String []args){

        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number:-");
        int number = in.nextInt();

    
      System.out.println("Fcatorial of a number " + Fact(number));

      in.close();


    }
    
}
