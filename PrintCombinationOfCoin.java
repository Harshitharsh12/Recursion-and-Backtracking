public class PrintCombinationOfCoin {
    public static void main(String[] args) {
        comb("",3);
    }
    public static void comb(String p,int n){
        if(n==0){
            System.out.println(p);
            return;
        }
        comb(p+"H",n-1);
        comb(p+"T",n-1);
    }
}
