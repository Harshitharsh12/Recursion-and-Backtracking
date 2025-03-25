import java.util.Arrays;

public class MovesAll0End {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0, 3, 5};
        move(arr,0,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void move(int[] arr,int i,int j) {
        if(j==arr.length){
            return;
        }
if(arr[j]!=0){
    int temp=arr[j];
    arr[j]=arr[i];
    arr[i]=temp;
    i++;

}
move(arr,i,j+1);
    }
}