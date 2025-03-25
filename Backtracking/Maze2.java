package Backtracking;

public class Maze2 {
    public static void main(String[] args) {
        int[][] maze = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        maze(maze, 0, 0, 2, 2);
    }

    static void maze(int[][] arr, int i, int j, int m, int n) {
        if (i == m && j == n){
            arr[i][j]=1;
            display(arr);
        return;}

        if (j < arr[0].length - 1) {
            arr[i][j] = 1;
            maze(arr, i, j + 1, m, n);
        }
        else {arr[i][j] = 1;
                maze(arr, i + 1, j, m, n);}
    }

    static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();}
    }
}
