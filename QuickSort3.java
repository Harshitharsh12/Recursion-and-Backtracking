import java.util.Arrays;

public class QuickSort3 {
    public static void main(String[] args) {
        int[] arr={11,10,0,6,6,5,9,876765,7,3233,345,87,6645689,54334,22,3435};
//        int[] arr={10,9,8,7,6,5,4,3,2,1};
        sorting(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sorting(int[]arr,int i,int j){
        if(i>=j){
            return;
        }
        int dp=pwrtLastElement(arr,i,j);
        sorting(arr,0,dp-1);
        sorting(arr,dp+1,j);
    }

    public static int pwrtLastElement(int[] arr,int start,int end) {
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
        return p;
    }

// or

//    public static int pwrtFirstElement(int[] arr,int start,int end){
//        int pivot=start;
//        int i=start;
//        int p=start;
//        while(i<arr.length){
//            if(arr[i]<arr[pivot]){
//                if(p==pivot){
//                    pivot=i;
//                }
//                int temp=arr[i];
//                arr[i]=arr[p];
//                arr[p]=temp;
//                p++;
//            }
//            i++;
//        }
//        int temp=arr[pivot];
//        arr[pivot]=arr[p];
//        arr[p]=temp;
//        return p;
//    }

}