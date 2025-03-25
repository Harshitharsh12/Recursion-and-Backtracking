package Backtracking;
public class MazeAndMe2 {

//    public static void main(String[] args) {
//        int[][] arr = {{0, 0, 0},
//                {0, 0, 0},
//                {0, 0, 0}};
//
//        back(arr, 0, 0, 2, 2, "");
//        System.out.println();
//        System.out.println(c);
//    }
//    static int c=0;
//    public static boolean back(int[][] arr, int i, int j, int m, int n, String s) {
//        if (i == m && j == n) {
//            System.out.print(s+" ");
//            c++;
//            return false;
//        }
//        if (i >= 0 && j >= 0 && i < arr.length && j < arr[0].length && arr[i][j] == 0) {
//                if (back(arr, i + 1, j, m, n, s+"V"))
//                    return true;
//                if (back(arr, i, j + 1, m, n, s+"H"))
//                    return true;
//                if (back(arr, i + 1, j + 1, m, n, s+"D"))
//                    return true;
//            }
//            return false;
//    }


    // or


    public static void main(String[] args) {
        int[][] arr = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};

        back(arr, 0, 0, 2, 2, "");
        System.out.println();
        System.out.println(c);
    }
static int c=0;
    public static void back(int[][] arr, int i, int j, int m, int n, String s) {
        if (i == m && j == n) {
            System.out.print(s + " ");
            c++;
            return;
        }
        if (i >= 0 && i < arr.length ) {
            back(arr, i + 1, j, m, n, s + "V");
        }

        if (j >= 0 && j < arr[0].length ) {
            back(arr, i, j + 1, m, n, s + "H");
        }
        if (i >= 0 && i < arr.length && j >= 0 && j < arr[0].length) {

            back(arr, i + 1, j + 1, m, n, s + "D");
        }
    }
}