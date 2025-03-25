public class Fibo {
    public static void main(String[] args) {
        fib(20,20);
    }
    static int c=0;
    public static void fib(int n,int temp){
        if(n<2){
            c=c+n;
            return;
        }
        fib(n-1,temp);
        fib(n-2,temp);
                if(n==temp){
        System.out.println(c);}

    }
}
