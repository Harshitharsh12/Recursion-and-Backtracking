import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
//        System.out.println(search(new int[]{1, 2, 9, 4, 8, 9}, 0, 9,list));
//        ArrayList<Integer> list=new ArrayList<Integer>();
//        search(new int[]{1, 2, 9, 4, 8, 9}, 0, 9,list);
//        System.out.println(list);
        System.out.println(search(new int[]{1, 2, 9, 4, 8, 9}, 0, 9));
    }
//    public static int search(int[] arr,int i,int target){
//        if(i==arr.length){
//            return -1;
//        }
//        if(arr[i]==target){
//            return i;
//        }
//        return search(arr,i+1,j,target);
//    }
//    static ArrayList<Integer>list=new ArrayList<Integer>();
//public static ArrayList<Integer> search(int[] arr,int i,int target){
//    if(i==arr.length){
//        return list;
//    }
//    if(arr[i]==target){
//        list.add(i);
//    }
//    return search(arr,i+1,target);
//}
//    public static ArrayList<Integer> search(int[] arr,int i,int target,ArrayList<Integer>temp){
//        if(i==arr.length){
//            return temp;
//        }
//        if(arr[i]==target){
//            temp.add(i);
//        }
//        return search(arr,i+1,target,temp);
//    }
//public static void search(int[] arr,int i,int target,ArrayList<Integer>temp){
//    if(i==arr.length){
//        return;
//    }
//    if(arr[i]==target){
//        temp.add(i);
//    }
//     search(arr,i+1,target,temp);
//}
public static ArrayList<Integer> search(int[] arr,int i,int target){
            ArrayList<Integer> list=new ArrayList<Integer>();
            if(i==arr.length){
        return list;
    }
    if(arr[i]==target){
        list= search(arr,i+1,target);
//        temp.add(i);
        list.add(0,i);
        return list;
    }

  return  search(arr,i+1,target);
}
}
