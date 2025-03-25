public class Subsequences {
    public static void main(String[] args) {
        ss("har","");
    }
    public static void ss(String up,String p){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
         char c=up.charAt(0);
         ss(up.substring(1),p+c);
         ss(up.substring(1),p);
    }
}
