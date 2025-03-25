import java.util.Arrays;

public class QuickSort2 {
    public static void main(String[] args) {
        int[] arr={11,10,0,6,6,5,9,876765,7,3233,345,87,6645689,54334,22,3435};
        sorting(arr,0,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void sorting(int[] arr,int i,int j,int pivot,int k){
        if(i>j){
            return;
        }
//        for(int k=i;k<j;k++) {
//            if (arr[k] < arr[j]) {
//                int temp = arr[pivot];
//                arr[pivot] = arr[k];
//                arr[k] = temp;
//                pivot++;
//            }}
//        int temp=arr[pivot];
//        arr[pivot]=arr[j];
//        arr[j]=temp;
//        sorting(arr,i,pivot-1,i);
//        sorting(arr,pivot+1,j,pivot+1);


        // or

        if(k==j){
            int temp=arr[pivot];
            arr[pivot]=arr[j];
            arr[j]=temp;
            sorting(arr,i,pivot-1,i,i);
            sorting(arr,pivot+1,j,pivot+1,pivot+1);

        }
        else if(arr[k]<arr[j]){
            int temp=arr[pivot];
            arr[pivot]=arr[k];
            arr[k]=temp;
            sorting(arr,i,j,pivot+1,k+1);
        }
        else{
            sorting(arr,i,j,pivot,k+1);

        }
    }}