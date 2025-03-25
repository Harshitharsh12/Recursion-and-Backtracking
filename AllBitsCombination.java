public class AllBitsCombination {
    public static void main(String[] args) {
        comb("",3);
    }
    public static void comb(String p,int n){
        if(n==0){
            System.out.println(p);
            return;
        }
        comb(p+"0",n-1);
        comb(p+"1",n-1);
    }
}
