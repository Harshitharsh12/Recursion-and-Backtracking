public class NumberOfDiceRollWithTargetSum {
    public static void main(String[] args) {
        System.out.println(numRollsToTarget(2,6,5));    }
    public static int numRollsToTarget(int n, int k, int target) {
        totalRolls(n,k,target,0);
        return count;
    }
    public  static int count=0;
    public static void totalRolls(int n,int k,int target,int num){
        if(n==0){
            if(getSum(num)==target)
                count++;
            return;
        }
        for(int i=1;i<=k;i++){
            totalRolls(n-1,k,target,num*10+i);
        }
    }
    public  static int getSum(int n)
    {int temp=0;
        while(n>0){
            int r=n%10;
            n=n/10;
            temp=temp+r;
        }
        return temp;
    }
}
