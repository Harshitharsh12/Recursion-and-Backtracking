import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={51,3,2,90,4,40};
        sorting(arr,0,1,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void sorting(int[]arr,int i,int j,int min){
        int n=arr.length;
        if(i==n-1){
            return ;
        }
        if(j==n){
            if(min!=i){
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;}
            sorting(arr,i+1,i+2,i+1);
        }
        else if(arr[j]<arr[min]){
            min=j;
            sorting(arr,i,j+1,min);}
        else{
            sorting(arr,i,j+1,min);}
}}
