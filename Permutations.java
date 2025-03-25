import java.sql.Array;
import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        per("hel","");
//        System.out.println(countPer("hel",""));
        System.out.println(list);

    }
    static ArrayList<String> list=new ArrayList<String>();
    public static void per(String up,String p){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        for(int i=0;i<=p.length();i++){
            per(up.substring(1),p.substring(0,i)+up.charAt(0)+p.substring(i));
        }
    }
//public static int countPer(String up,String p){
//    if(up.isEmpty()){
//        return 1;
//    }
//    int c=0;
//    for(int i=0;i<=p.length();i++){
//     c=c+countPer(up.substring(1),p.substring(0,i)+up.charAt(0)+p.substring(i));
//    }
//    return c;
//}
}
