import java.util.Arrays;

public class InsertinSort {
    public static void main(String[] args) {
        int[] arr={2,3,5,66,1};
        sorting(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sorting(int[] arr,int i,int j){
        if(i==arr.length-1){
            return;
        }
        if (j == 0) {
            sorting(arr,i+1,i+2);
return;
        }
        if(arr[j]<arr[j-1]){
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            sorting(arr,i,j-1);
        }
        else{
            sorting(arr,i+1,i+2);
        }
    }
}
