public class CallByValueInArray {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4};
        change(arr);
        System.out.println(arr[0]);

    }
    public static void change(Integer[]arr){
        arr[0]=9;
    }
}
