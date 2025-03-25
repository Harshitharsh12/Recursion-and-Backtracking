package Backtracking;

import java.util.ArrayList;

public class NQueens {
    public static void main(String[] args) {
        int n=4;
        String[][] board={{" "," "," "," "},
                {" "," "," "," "},
                {" "," "," "," "},
                {" "," "," "," "}};
        queens(board,n,0,0);
        System.out.println(list);
    }
    static int c=0;
    static ArrayList<String[][]>list=new ArrayList<String[][]>();
    static void queens(String[][] board,int n,int i,int j){
        if(c==n){
            list.add(board);
            return;
        }
       if(j<board[0].length&&rowCheck(i,j,board)&&leftDigCheck(i,j,board)&&rightDigCheck(i,j,board)){
           board[i][j]="Q";
           c++;
           queens(board,n,i+1,0);
       }
       else if(j==board[0].length){
           j=j-1;
           while(j>=0){
               if(board[i-1][j]=="Q"){
                   board[i-1][j]=" ";
                   c--;
                   queens(board,n,i-1,j+1);
break;
               }
               j--;
           }
       }
       else{
           queens(board,n,i,j+1);
       }
    }

    static boolean rowCheck(int i,int j,String[][] board){
        boolean check=true;
        for(int m=i-1;m>=0;m--){
            if(board[m][j]!=" "){
                check=false;
                break;
            }
        }
return check;
    }
    static boolean leftDigCheck(int i,int j,String[][] board) {
        boolean check = true;
        for (int m = i - 1; m >= 0; m--) {
            int n = j - 1;
            if(n>=0){
                if (board[m][n]!=" ") {
                    check = false;
                    break;
                }
            }
            j--;
        }
        return check;
    }
    static boolean rightDigCheck(int i,int j,String[][] board) {
        boolean check = true;
        for (int m = i - 1; m >= 0; m--) {
            int n = j + 1;
            if(n<board.length){
                if (board[m][n]!=" ") {
                    check = false;
                    break;
                }
            }
            j++;
        }
        return check;
    }
    static void display(String[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"    ");
            }
            System.out.println();
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
