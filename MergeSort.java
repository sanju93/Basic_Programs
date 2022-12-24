package Recursion;
public class MergeSort {


    public static void merge(int left[],int right[],int arr[]){

        int i = 0;
        int j = 0; 
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left [i];
                i++;k++;
            }
            else{
                arr[k] = right[j];
                j++;k++;
            }
        }

        if (i < left.length) {
            while (i < left.length) {
                arr[k] = left[i];
                i++;k++;
            }
        }else{
            while(j < right.length) {
                arr[k] = right[j];
                j++;k++;
            }
        }

        

    }

    public static void mergeSort(int arr[]) {

        if (arr.length == 1)
        {
            return;
        }

        int left[] = new int[arr.length/2];
        int right[] = new int[arr.length - left.length];
        for (int i = 0;i<left.length;i++){
            left[i] = arr[i];
        }
        for (int i = arr.length/2;i<arr.length;i++){
            right[i-arr.length/2] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(left,right,arr);

      
     
   
        
        

    }

    public static void main(String args[]) {
        int arr[] = {2,43,542,652,23,13,43,45};
        mergeSort(arr);
        for (int i = 0; i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    
}
