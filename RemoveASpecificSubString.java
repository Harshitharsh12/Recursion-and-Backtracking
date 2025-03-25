public class RemoveASpecificSubString {
    public static void main(String[] args) {
//        System.out.println(remove("applea","apple",""));
        System.out.println(remove("ap"));
    }
    public static String remove(String up,String s,String p){
        if(up.isEmpty()){
            return p;
        }
        if(up.startsWith(s)){
            return remove(up.substring(s.length()),s,p);
        }
        else{
            return  remove(up.substring(1),s,p+up.charAt(0));
        }
    }


    // skip app only when it is not apple.
    public static String remove(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app")&& !up.startsWith("apple")){
            return remove(up.substring(3));
        }

        else{
            return up.charAt(0)+ remove(up.substring(1));

        }
    }

}
