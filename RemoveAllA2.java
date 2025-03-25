public class RemoveAllA2 {
    public static void main(String[] args) {
//        System.out.println(remove("fgghhaghba",""));
        System.out.println(remove("fgghhaghba"));
//        remove("fgghhaghba","");
    }
//    public static void remove(String up,String p){
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//        char ch=up.charAt(0);
//        if(ch=='a'){
//            remove(up.substring(1),p);
//        }
//        else{
//        remove(up.substring(1),p+ch);}
//    }
//    public static String remove(String up,String p) {
//        if (up.isEmpty()) {
//            return p;
//        }
//        char ch = up.charAt(0);
//        if (ch == 'a') {
//         return   remove(up.substring(1), p);
//        } else {
//          return  remove(up.substring(1), p + ch);
//        }
//    }

    public static String remove(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return   remove(up.substring(1));
        } else {
            return ch+ remove(up.substring(1));
        }
    }
}
