package Backtracking;

public class MinRouteInMazeAndMe {
    public static void main(String[] args) {
        int[][] arr = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        back(arr,0, 0, 2, 2,1,Integer.MAX_VALUE);
        for(int k=0;k<minpath.length;k++){
            for(int e:minpath[k]){
                System.out.print(e+"  ");}
            System.out.println();
        }
    }
  static  int[][]minpath=new int[3][3];

    static void min(int[][] maze){
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze[i].length;j++){
                minpath[i][j]=maze[i][j];

            }
        }
    }
    public static boolean back(int[][] arr,int i,int j,int m,int n,int c,int min){
        if(i==m&&j==n){
            arr[i][j]=c;
           if(c<min){
               min=c;
               min(arr);
           }
            return false;
        }
        if(i>=0&&j>=0&&i<arr.length&&j<arr[0].length&&arr[i][j]==0){
            arr[i][j]=c++;
            if(back(arr,i+1,j,m,n,c,min))
                return true;
            if(back(arr,i,j+1,m,n,c,min))
                return true;
            if(back(arr,i+1,j+1,m,n,c,min))
                return true;
            arr[i][j]=0;
        }
        return false;
    }
}
