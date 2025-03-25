public class Palindrome {
    public static void main(String[] args) {
        System.out.println(pal("23329789",0,7));
    }
    public static boolean pal(String n,int i,int j){
        if(i>=j){
            return true;
        }
        if(n.charAt(i)==n.charAt(j)){
            return pal(n,i+1,j-1);}

        return false;

    }
}
