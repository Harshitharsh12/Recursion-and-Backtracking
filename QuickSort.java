import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={11,10,0,6,6,5,9};
        sorting(arr,0,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    // Not useful for bigger output , TLE(Time limit exceed) will come for bigger input:
    public static void sorting(int[] arr,int i,int j,int pivot){
if(i>j){
    return;
}
        if(i==j){
            int temp=arr[pivot];
            arr[pivot]=arr[j];
            arr[j]=temp;
            sorting(arr,0,pivot-1,0);
            sorting(arr,pivot+1,j,pivot+1);

        }
    else if(arr[i]<arr[j]){
           int temp=arr[pivot];
           arr[pivot]=arr[i];
           arr[i]=temp;
           sorting(arr,i+1,j,pivot+1);
       }
       else{
           sorting(arr,i+1,j,pivot);
       }
}}