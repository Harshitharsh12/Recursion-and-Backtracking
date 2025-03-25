import java.util.ArrayList;

public class SubSets {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        subSets(arr,new ArrayList<Integer>(), arr.length,0);
        System.out.println(list);
    }
    public static ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
    public static void subSets(int[]arr, ArrayList<Integer> l,int length,int i){
        if(i==length){
    list.add(new ArrayList<>(l));
       return;}

//ArrayList<Integer> l2=new ArrayList<Integer>();
//l2.add(arr[i]);
//for(int j=0;j<l.size();j++){
//    l2.add(j,l.get(j));
//}
subSets(arr,l,length,i+1);
        l.add(arr[i]);
subSets(arr,l,length,i+1);
    }
    }
