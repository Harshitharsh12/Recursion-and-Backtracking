import java.lang.reflect.Array;
import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr={1,3,2,4,8,3,6,66,7877,667564,7,54,999908};
        sorting(arr,0,arr.length-1);
        System.out.println(Arrays.toString( arr));
    }
    public static void sorting(int[]arr,int i,int j){
        if(i==j){
            return ;
        }
        int mid=(i+j)/2;
        sorting(arr,i,mid);
        sorting(arr,mid+1,j);
int[] mix=new int[j-i+1];
int a=i;
int b=mid+1;
int k=0;
while(k<(j-i+1)){
    if(a>mid){
        mix[k]=arr[b];
        k++;
        b++;
    }
    else if(b>j){
        mix[k]=arr[a];
        k++;
        a++;}
 else if(arr[a]<arr[b]){
        mix[k]=arr[a];
        k++;
        a++;
    }
    else{
        mix[k]=arr[b];
        k++;
        b++;
    }
}
for(int n=0;n<(j-i+1);n++){
    arr[n+i]=mix[n];
}}
}