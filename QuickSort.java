package Recursion;



public class QuickSort {

    public static int partition(int arr[],int si,int ei){

        //finding the place of the pivot element 


        int pivotElement = arr[si];
        int pivotElementCount = 0;

        for (int i = si+1; i <= ei;i++){
            if (arr[i] < pivotElement){
                pivotElementCount++;
            }
        }

        int temp = arr[si + pivotElementCount];
        arr[si + pivotElementCount] = pivotElement;
        arr[si] = temp;

        int i = si;
        int j = ei;

        while(i < j){

            if (arr[i] < pivotElement){
                i++;
            }
            else if (arr[j] >= pivotElement)
            {
                j--;
            }
            else{
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }



        }
        
         

          return si+pivotElementCount;

        


    }

    public static void Quick(int arr[],int si,int ei) {

        if (si >= ei){
            return;
        }

        int i = partition(arr,si,ei);
      
        Quick(arr,si,i-1);
        Quick(arr,i+1,ei);

    }

    public static void main(String args[]) {
        int arr[] = {7,8,9,34,56,23,54,12};
        Quick(arr,0,arr.length-1);


         for (int i = 0; i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
       }
    
}
