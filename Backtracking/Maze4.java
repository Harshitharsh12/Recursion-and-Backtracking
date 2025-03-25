package Backtracking;

public class Maze4 {
    public static void main(String[] args) {
        int[][] maze= {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,-1,0,-1},
                {0,0,0,0,0}
        };
        showPath(maze,0,0,3,4);
//        display(minpath,maze.length,maze[0].length);
    }
    static int min=Integer.MAX_VALUE;
    static int[][]minpath=new int[100][100];
    static void min(int[][] maze){
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze[i].length;j++){
                minpath[i][j]=maze[i][j];

            }
        }
    }
    static int count=1;
    static void showPath(int[] [] maze,int i,int j,int m,int n) {
        if (m == i && n == j) {
            maze[m][n]=count;
            display(maze,maze.length,maze[0].length);
//             for minimum path:
//            if(count<min){
//                min=count;
//                min(maze);
//            }
            maze[m][n]=0;
            return;

        }
        //down:
        if (m < maze.length - 1 && maze[m + 1][n] == 0) {
            maze[m][n]=count++;
            showPath(maze, i, j, m + 1, n);
            maze[m][n]=0;
            count--;
        }
        // right:
        if (n < maze[0].length - 1 && maze[m][n + 1] == 0) {
            maze[m][n]=count++;

            showPath(maze, i, j, m, n + 1);
            maze[m][n]=0;
            count--;
        }
        // left:
        if (n > 0 && maze[m][n - 1] == 0) {
            maze[m][n]=count++;

            showPath(maze, i, j, m, n - 1);
            maze[m][n]=0;
            count--;
        }
        //up:
        if(m>0&&maze[m-1][n]==0) {
            maze[m][n]=count++;

            showPath(maze, i, j, m - 1, n);
            maze[m][n]=0;
            count--;
        }
    }
    static void display(int [][] maze,int r,int c){
        for(int i=0;i<r;i++){
            for(int j= 0; j<c; j++)
                System.out.print(maze[i][j]+"      ");
            System.out.println();
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }}
