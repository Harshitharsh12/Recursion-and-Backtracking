public class PairofSameSum {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,2,1};
        int totalSum=0;
        for(int i:arr){
            totalSum+=i;
        }
        ps(arr,"","",0,0,0,totalSum);
    }
    public static void ps(int[] arr,String up,String up2,int sum,int sum2,int i,int totalSum){
        if(i==arr.length) {
if(sum==sum2)
    System.out.println(up+" "+up2);
    return;
        }

        // Backtracking :
        if(sum>totalSum/2||sum2>totalSum/2){
            return;
        }
        ps(arr,up+arr[i],up2,sum+arr[i],sum2,i+1,totalSum);
        ps(arr,up,up2+arr[i],sum,sum2+arr[i],i+1,totalSum);}

    }

