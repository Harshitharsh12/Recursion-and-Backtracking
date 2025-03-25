import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={2,3,10};
        System.out.println(Arrays.toString(merge(arr1,arr2)));
    }
    public static int[] merge(int[] arr1,int[] arr2){
        int n=arr1.length;
        int n2=arr2.length;
        int[] res=new int[n+n2];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length||j<arr2.length){
            if(i==arr1.length){
            res[k++]=arr2[j++];
        }
         else  if(j==arr2.length){
                res[k++]=arr1[i++];
            }
        else  if(arr1[i]<arr2[j])
            res[k++]=arr1[i++];
        else
            res[k++]=arr2[j++];
    }
return res;
}}
