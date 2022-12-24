package Recursion;

public class Count_Zeros {

    public static int zeros(int number){
        if (number <= 10)
        {
          if (number % 10 == 0){
              return 1;
          }
          else{
              return 0;
          }
        }

        int output = zeros(number/10);

        if (number % 10 == 0){
            return output+1;
        }
        else{
            return output;
        }

    }

    public static void main(String args[]){
        int number = 00100;
        System.out.println(number%10);
        //System.out.println(zeros(number));
    }
    
}
