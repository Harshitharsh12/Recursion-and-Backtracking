public class CircularBinarySearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{5,1,3},0,2,3));
    }
    public static int search(int[] arr,int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            if(arr[start]<=target&&arr[mid]>=target){
            return search(arr,start,mid-1,target);}
            else{
                return search(arr,mid+1,end,target);}

        }
        if(arr[end]>=target&&arr[mid]<=target){
            return search(arr,mid+1,end,target);}
        else
            return search(arr,start,mid-1,target);

    }
}
