package Backtracking;

public class MouseAndCheeze2 {

    static int[][] ans= new int[100][100];

    static void display(int x,int y){

        for(int i=0;i<=x;i++){

            for(int j= 0; j<=y; j++)

                System.out.print(ans[i][j]+" ");

            System.out.println();

        }

    }

    static boolean findCheeze(int[][] maze, int i, int j, int x, int y){

        if(i==x && j==y){

            ans[i][j]= 1;

            return true;

        }

// Mark the curr loc

        ans[i][j]=1;

        if(i<= x){

//move down

            if(findCheeze(maze, i+1, j, x, y))

                return true;

//move right

            if(findCheeze(maze, i, j+1, x, y))

                return true;

        }

        return false;

    }

    public static void main(String[] args) {

        int[][] maze= {

                {0,0,0,0,0},

                {0,0,0,0,0},

                {0,0,0,0,0},

                {0,0,0,0,0}

        };

        int x=3,y=4; //pos of cheeze

        int i=0,j=0; //pos of mouse

        findCheeze(maze, i, j, x, y);

        display(x,y);
    }
}