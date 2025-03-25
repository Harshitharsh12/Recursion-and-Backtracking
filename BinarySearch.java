public class BinarySearch
{
    public static void main(String[] args) {
        System.out.println(search(new int[]{1,4,8,9,10,18,100},0,6,180));
    }
    public static int search( int[] arr,int i,int j,int target){
        if(i>j)
            return -1;
            int n = i + (j - i) / 2;
            if (arr[n] == target) {
                return n;
            }
            if (arr[n] < target) {
                return search(arr, n + 1, j, target);
            }
                return search(arr, i, n - 1, target);
    }
}
