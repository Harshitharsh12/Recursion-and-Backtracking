public class NQueens {
    public static void main(String[] args) {
        per(new int[3][3]);
    }
    public static void per(int[] []arr){
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int m=0;m<arr.length;m++){
                    for(int n=0;n<arr[m].length;n++){
                        for(int k=0;k<arr.length;k++){
                            for(int l=0;l<arr[0].length;l++){
                                if(i==m||m==k){
                                    continue;
                                }
                                if(j==n||n==l){
                                    continue;
                                }
                                if(i+1==m&&j+1==n||j-1==n){
                                    continue;
                                }
                                if(i==m+1&&j+1==n||j-1==n){
                                    continue;
                                }
                                System.out.println(i+""+j+","+m+""+n);
                                c++;
                            }
                        }

                    }
                }
            }
        }
        System.out.println(c);
//



//        if(i==m){
//            per(arr,i,j,m+1,n);
//        }
//        if(j==n){
//            per(arr,i,j,m,n+1);
//        }
//        if(i+1==m&&j+1==n){
//            per(arr,i,j,m,n+1);
//        }
//        if(i+1==m&&j-1==n){
//            per(arr,i,j,m,n+1);
//        }
//        if(n==arr[0].length){
//            per(arr,i,j,m+1,0);
//        }
//    else    if(m==arr.length){
//            per(arr,i,j+1,0,0);
//        }
//     else   if(j==arr[0].length){
//            per(arr,i+1,0,0,0);
//        }
//       else{
//       System.out.println(i+""+j+","+m+""+n);

//                per(arr,i,j,m,n+1);

    }
    }

