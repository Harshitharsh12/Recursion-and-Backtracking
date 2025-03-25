import java.util.ArrayList;

public class ListOfAllSubSequences {
    public static void main(String[] args) {
//        subSequences("Har","");
//        System.out.println(list);
//         ArrayList<String> list=new ArrayList<String>();
//        subSequences("Har","",list);
//        System.out.println(list);
        System.out.println( subSequences("Har",""));

    }
//    public static ArrayList<String> list=new ArrayList<String>();
//    public static void subSequences(String up,String p,ArrayList<String> list){
//        if(up.isEmpty()){
//              list.add(p);
//              return;
//        }
//         subSequences(up.substring(1),p+up.charAt(0),list);
//         subSequences(up.substring(1),p,list);
//    }

    // return a list:
    public static ArrayList<String> subSequences(String up,String p){
        ArrayList<String> list=new ArrayList<String>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
         list=subSequences(up.substring(1),p+up.charAt(0));
        ArrayList<String> list2=subSequences(up.substring(1),p);
//        for(int i=0;i<subSequences(up.substring(1),p).size();i++){
//        list.add(list2.get(i));}
        // or
        list.addAll(list2);
        // or
//        list.addAll(0,list2);
        return list;
    }


}
