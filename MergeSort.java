import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={1,3,2,4,5,6,798,90,5};
//        int[] arr={1};
        System.out.println(Arrays.toString(sorting(arr)));
        System.out.println(Arrays.toString(sorting(arr)));
    }
    public static int[] sorting(int[]arr){
        int n=arr.length;
        if(n==1){
            return arr;
        }
        int mid=n/2;
        int[]arr1=sorting(Arrays.copyOfRange(arr,0,mid));
        int[]arr2=sorting(Arrays.copyOfRange(arr,mid,n));
        int n1=arr1.length;
        int n2=arr2.length;
        int[] array=new int[n1+n2];
        int i=0;
        int k=0;
        int j=0;
        while(k!=array.length){
            if(i==n1){
                array[k++]=arr2[j++];

            }
            else if(j==n2){
                array[k++]=arr1[i++];


            }
            else if(arr1[i]<=arr2[j]){
                array[k++]=arr1[i++];

            }
            else {
                array[k++]=arr2[j++];

            }
        }
return array;
    }
}