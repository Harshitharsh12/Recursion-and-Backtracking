public class AllSubSequences {
    public static void main(String[] args) {
//        subSequences("Har","");
        System.out.println(countSubSequences("Har",""));
    }
    public static void subSequences(String up,String p){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        subSequences(up.substring(1),p+up.charAt(0));
        subSequences(up.substring(1),p);
    }
    public static int countSubSequences(String up,String p){
        if(up.isEmpty()){
            return 1;
        }
        return countSubSequences(up.substring(1),p+up.charAt(0))+countSubSequences(up.substring(1),p);
    }
}
