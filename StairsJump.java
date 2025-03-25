public class StairsJump {
    public static void main(String[] args) {
        jump("",4);
    }
    public static void jump(String p,int n){
        if(n==0){
            System.out.println(p);
            return;
        }
        if(n<0){
            return;
        }
         jump(p+"1",n-1);
        jump(p+"2",n-2);
    }
}
