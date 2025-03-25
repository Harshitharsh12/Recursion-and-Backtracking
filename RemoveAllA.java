public class RemoveAllA {
    public static void main(String[] args) {
//        String s="476hgffgdanaajanaab";
        StringBuilder s=new StringBuilder("476hgffgdanaajanaab");
        System.out.println(removeA(s,0,s.length()));
    }
//    public static String removeA(String s,int i,int n){
//        if(i==n){
//            return  s;
//        }
//        if(s.charAt(i)=='a'){
//            s=s.substring(0,i)+s.substring(i+1,n);
//           return removeA(s,i,n-1);
//        }
//        else{
//          return  removeA(s,i+1,n);
//        }
//    }

    // or

    public static StringBuilder removeA(StringBuilder s,int i,int n){
        if(i==n){
            return  s;
        }
        if(s.charAt(i)=='a'){
            return removeA(s.deleteCharAt(i),i,n-1);
        }
        else{
            return  removeA(s,i+1,n);
        }
    }

}
