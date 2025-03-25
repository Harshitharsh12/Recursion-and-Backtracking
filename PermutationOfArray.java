import java.util.ArrayList;

public class PermutationOfArray {
    public static void main(String[] args) {
        per(new int[] {1,2,3},new ArrayList<Integer>(),0);
        System.out.println(list);
    }
    static ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
    public static void per(int[] arr,ArrayList<Integer>l,int i){
        if(i==arr.length){
            list.add(new ArrayList<Integer>(l));
            return;
        }
        for(int j=0;j<=l.size();j++){
            l.add(j,arr[i]);
        per(arr,l,i+1);
        l.remove(j);}
    }
}
