import java.util.Arrays;

public class ShiftAllDuplicatesAtTheEnd {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,4,4};
        System.out.println( shiftRight(arr,0,1,1));
        System.out.println(Arrays.toString(arr));
    }
    static int c=101;
    public static  int shiftRight(int[] arr,int i,int j,int count){
        if(j==arr.length){
            return count;
        }
        if(arr[i]==arr[j]){
            lShift(arr,i);
            arr[arr.length-1]=c;
            c++;
          return shiftRight(arr,i,j,count);
        }
        else {
            if(arr[j]>=101){
                return  shiftRight(arr,i+1,j+1,count);

            }
            return  shiftRight(arr,i+1,j+1,count+1);
        }
    }
    public static void lShift(int[] arr,int i){
        while(i<arr.length-1){
            arr[i]=arr[i+1];
                    i++;
        }
    }
}
