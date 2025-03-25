import java.util.ArrayList;

public class SubSets2 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        ss(arr,0,new ArrayList<>(),2,0);
        System.out.println(l);
    }
    public static ArrayList<ArrayList>l=new ArrayList<ArrayList>();
    // Recursion code:
//    public static void ss(int[] arr,int i,ArrayList<Integer>list,int target,int sum){
//        if(i==arr.length){
//            if(sum==target){
//              l.add(list);
//                System.out.println(list);
//            }
//            return;
//        }
//        ss(arr,i+1,list,target,sum);
//        list.add(arr[i]);
//        ss(arr,i+1,list,target,sum+arr[i]);
//        list.remove(list.size()-1);
//    }



    // Backtracking code:
    public static void ss(int[] arr,int i,ArrayList<Integer>list,int target,int sum){
        if(i==arr.length){
            if(sum<=target){
                    l.add(new ArrayList<>(list));

                System.out.println(list);
            }
            return;
        }
        if(sum>target){
            return;
        }
        ss(arr,i+1,list,target,sum);
        list.add(arr[i]);
        ss(arr,i+1,list,target,sum+arr[i]);
        list.remove(list.size()-1);
    }
    public static int sum(ArrayList<Integer>list){
        int sum=0;
        for(int i:list){
            sum+=i;}
        return sum;
    }
}
