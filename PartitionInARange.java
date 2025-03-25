import java.util.Arrays;

public class PartitionInARange {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,2,7};
        pwrtFirstElement(arr,2,5);
        System.out.println(Arrays.toString(arr));
    }

    // taking pivot as last element:
     public static void pwrtLastElement(int[] arr,int start,int end){
        int pivot=end;
        int i=start;
        int p=start;
        while(i<pivot){
            if(arr[i]<arr[pivot]){
                int temp=arr[i];
                arr[i]=arr[p];
                arr[p]=temp;
                p++;
            }
            i++;
        }
        int temp=arr[pivot];
        arr[pivot]=arr[p];
        arr[p]=temp;
    }

//    taking pivot as first element:
public static void pwrtFirstElement(int[] arr,int start,int end){
    int pivot=start;
    int i=start;
    int p=start;
    while(i<arr.length){
        if(arr[i]<arr[pivot]){
            if(p==pivot){
                pivot=i;
            }
            int temp=arr[i];
            arr[i]=arr[p];
            arr[p]=temp;
            p++;
        }
        i++;
    }
    int temp=arr[pivot];
    arr[pivot]=arr[p];
    arr[p]=temp;
}

}
