package Backtracking;

public class Maze3 {
    public static void main(String[] args) {
        int[][] maze= {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,-1,0,0,-1},
                {0,0,0,0,0}
        };
        showPath(maze,0,0,3,4);
    }
    static int count=1;
    static void showPath(int[] [] maze,int i,int j,int m,int n) {
        if (m == i && n == j) {
            maze[m][n]=count;

            display(maze);
            
            return;
        }
        if (m < maze.length - 1 && maze[m + 1][n] == 0) {
            maze[m][n]=count++;
            showPath(maze, i, j, m + 1, n);
        } else if (n < maze[0].length - 1 && maze[m][n + 1] == 0) {
            maze[m][n]=count++;

            showPath(maze, i, j, m, n + 1);
        } else if (n > 0 && maze[m][n - 1] == 0) {
            maze[m][n]=count++;

            showPath(maze, i, j, m, n - 1);
        }else if (m> 0 && maze[m-1][n] == 0) {
            maze[m][n]=count++;

            showPath(maze, i, j, m - 1, n);
        }
    }
    static void display(int [][] maze){
        for(int i=0;i<maze.length;i++){
            for(int j= 0; j<maze[i].length; j++)
                System.out.print(maze[i][j]+"      ");
            System.out.println();
            System.out.println();
        }
    }
}
