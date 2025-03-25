import java.util.ArrayList;

public class SubsequencesWithASCIIValues{
    public static void main(String[] args) {
                subSequences("abc","");
        System.out.println(list);
    }
     static ArrayList<String>list=new ArrayList<String>();
    public static void subSequences(String up,String p){
        if(up.isEmpty()){
            list.add(p);
            return ;
        }
        subSequences(up.substring(1),p+up.charAt(0));
        subSequences(up.substring(1),p);
        subSequences(up.substring(1),p+(0+up.charAt(0)));

    }
}

