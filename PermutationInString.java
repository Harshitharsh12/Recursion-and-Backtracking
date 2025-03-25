public class PermutationInString {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab","eidboaoo"));
    }
    public static boolean checkInclusion(String s1, String s2) {
        check(s1,s2,"");
        return res;
    }
    static boolean res=false;
    public static void check(String up,String s2,String p){
        if(up.isEmpty()){
            if(s2.contains(p))
                res=true;
            return;
        }
        for(int i=0;i<=p.length();i++){
            check(up.substring(1),s2,p.substring(0,i)+up.charAt(0)+p.substring(i));
        }
    }
}
