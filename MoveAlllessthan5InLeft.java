import java.util.Arrays;

public class MoveAlllessthan5InLeft {
    public static int partition(int[] arr) {

        int n = arr.length;
        int pivot = arr[0];
        int index = n-1;
        for (int i = n-1; i >0; i--) {
            if (arr[i] > pivot) {
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
            index--;
        }}
        int temp = arr[0];
        arr[0] = arr[index];
        arr[index] = temp;
        return index;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {4, 3, 2, 6, 8, 5};
        int indexPivot = partition(arr);
        System.out.println(indexPivot);
        for (int val : arr) {
            System.out.print(val + " ");
        }

    }
}