package Backtracking;

public class SubStringOfAString {
    public static void main(String[] args) {
        subString("ababd");
        System.out.println(answer);
//        System.out.println(answer.substring(0,0));
    }
    static String answer="";
    static void subString(String ques){
        if(ques.length()==0){
            return;
        }
        for(int i=1;i<=ques.length();i++){
            System.out.println(ques.substring(0,i));

        }
        subString(ques.substring(1));
    }
    public static  boolean pal(String ans){
        int a=0;
        int b=ans.length()-1;
        while(a<=b){
            if(ans.charAt(a)!=ans.charAt(b)){
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}
