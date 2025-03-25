public class PrintArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
//        printArray(arr,arr.length,0);
        System.out.println(printArray(arr,arr.length-1));
    }
//    public static  void printArray(int[] arr,int n,int i){
//        if(i==n){
//            return;
//        }
//        System.out.println(arr[i]);
//        printArray(arr,n,i+1);
//    }

    //  or
    public static  int printArray(int[] arr,int n){
        if(n<0){
            return 0;
        }
      return arr[n]+ printArray(arr,n-1);
    }
}
