package Backtracking;

public class MazeandMe {
    public static void main(String[] args) {
        int[][] arr = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        back(arr, 0, 0, 2, 2);
    }
    public static boolean back(int[][] arr,int i,int j,int m,int n){
        if(i==m&&j==n){
            arr[i][j]=1;
            for(int k=0;k<arr.length;k++){
                for(int e:arr[k]){
                    System.out.print(e+"  ");}
                System.out.println();
            }
            System.out.println();
            System.out.println();
            return false;
        }
        if(i>=0&&j>=0&&i<arr.length&&j<arr[0].length&&arr[i][j]==0){
            arr[i][j]=1;
            if(back(arr,i+1,j,m,n))
                return true;
            if(back(arr,i,j+1,m,n))
                return true;
            if(back(arr,i+1,j+1,m,n))
                return true;
        arr[i][j]=0;
        }
        return false;
    }
}
