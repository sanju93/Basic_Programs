package Recursion;

public class Sum_In_Array {

    public static int occur_in_last_position(int arr[],int x,int index,int pos){
        if (index == arr.length - 1){
            if (arr[index] == x){
                  pos = index;
                  return pos;
            }
        }


        if (arr[index] == x){
            pos = index;
        }

        return occur_in_last_position(arr, x, index+1, pos);
    }

    public static int occur_in_first_position(int arr[],int x,int index,int pos){

      

        if (index == arr.length - 1){
            if (arr[index] == x){
                pos = index;
            }
             return pos;
        }

        if (arr[index] == x){
            pos = index;
            return pos;
        }

        return occur_in_first_position(arr, x, index+1, pos);


    }

    public static boolean CheckN_extended(int arr[],int x,int i){
        if (i == arr.length)
        {
            return false;
        }

        if (arr[i] == x){
            return true;
        }

        return CheckN_extended(arr, x, i+1);
    }

    public static boolean CheckN(int arr[],int x){
        int i = 0;
        return CheckN_extended(arr,x,i);
    }

    public static int Sum_extended(int arr[],int length){
        if (length == 0) {
            return arr[length];
        }

        int output = Sum_extended(arr,length-1);
        return arr[length] + output;
    }

    public static int Sum(int arr[]){
        int length = arr.length;
        return Sum_extended(arr,length-1);
    }

    public static void main(String args[]){
        int arr[] = {1,2,4,5,6,3,6};
        //System.out.println(Sum(arr));
       // System.out.print(CheckN(arr, 10));

       System.out.println("position in first occurence of the element " + occur_in_first_position(arr, 6, 0, 0));
       System.out.println("position of last occurence of the element " + occur_in_last_position(arr, 6, 0, 0));
    }
    
}
