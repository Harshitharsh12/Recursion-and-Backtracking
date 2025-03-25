public class ArraySortedorNot {
    public static void main(String[] args) {
        System.out.println(sorting(new int[]{1,2,3,4,2,5},0,6));
    }
    public static boolean sorting(int[] arr,int i,int n){
        if(i==n-1)
            return true;

        if(arr[i]<=arr[i+1])
            return sorting(arr,i+1,n);

        return false;
    }
}
