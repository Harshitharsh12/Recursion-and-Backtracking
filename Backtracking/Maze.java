package Backtracking;

//Constraints: You can only go towards Right and Down:
public class Maze {
    public static void main(String[] args) {
        System.out.println(totalRoutes(new int[3][3],0,0));
    }
    static int totalRoutes(int[][] arr,int i,int j){
        if(i==arr.length-1||j==arr[0].length-1){
            return 1;
        }
        return totalRoutes(arr,i+1,j)+totalRoutes(arr,i,j+1);
    }
}
