package Recursion;
public class BinarySearch {


    public static Boolean Binary_Search(int arr[],int start,int end,int element){
        if (start > end){
            return false;
        }

        int mid = (start + end) / 2;

        if (arr[mid] == element)
        {
            return true;
        }

        if (arr[mid] > element){
            start = mid + 1;
            return Binary_Search(arr, start, end, element);
        }
        else{
            end = mid - 1;
            return Binary_Search(arr, start, end, element);
        }
        
    }

    public static void main(String args[]) {

        int arr[] = {1,2,3,4,6,7,8};
        System.out.println(Binary_Search(arr,0,arr.length-1,5));

    }
  

     
}
