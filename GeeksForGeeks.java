class Solution {
    public static void main(String[] args) {
        System.out.println(2+Character.getNumericValue('2'));
        System.out.println((char)97);
        System.out.println('a'+1);
        System.out.println('2'-'0');
        System.out.println(Integer.MAX_VALUE);
    }
    // Function to sort an array using quick sort algorithm.
//    static void quickSort(int arr[], int i, int j) {
//        if(i>=j){
//            return;
//        }
//        int dp=move(arr,i,j,i,i);
//        quickSort(arr,0,dp-1);
//        quickSort(arr,dp+1,j);
//    }
//
//    static int move(int arr[], int i, int j,int p,int pivot) {
//        if(i>j){
//            int temp=arr[p];
//            arr[p]=arr[pivot];
//            arr[pivot]=temp;
//            return p;
//        }
//        if(i==pivot){
//            return move(arr,i+1,j,p,pivot);
//        }
//        if(arr[i]<=arr[pivot]){
//            if(p==pivot){
//                int temp=arr[i];
//                arr[i]=arr[p];
//                arr[p]=temp;
//                return  move(arr,i+1,j,p+1,i);
//            }
//            else{
//                int temp=arr[i];
//                arr[i]=arr[p];
//                arr[p]=temp;
//                return move(arr,i+1,j,p+1,pivot);}
//        }
//        else{
//            return move(arr,i+1,j,p,pivot);
//        }}// your code here
}