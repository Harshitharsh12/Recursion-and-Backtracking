import java.util.*;
public class BubbleSortUsingRecursion {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sorting(new int[]{3,3,2,1,8,4,0,98},0,0)));
    }
    public static int[] sorting(int[]arr,int i,int j){
        if(i==arr.length-1){
            return arr;
        }
        if(j==arr.length-1-i){
            return sorting(arr,i+1,0);
        }
        if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
        return sorting(arr,i,j+1);}
}
