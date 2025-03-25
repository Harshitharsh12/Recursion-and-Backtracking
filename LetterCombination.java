import java.util.ArrayList;

public class LetterCombination {
    public static void main(String[] args) {
        System.out.println(letterCombinations("5689"));
        System.out.println(c);
    }
    public static  ArrayList<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return list;
        }
        comb(digits,"");
        return list;
    }
    public static ArrayList<String>list=new ArrayList<String>();
    public static int c=0;
    public  static void comb(String up,String p){
        if(up.isEmpty()){
            list.add(p);
            c++;
            return;
        }
        int c=((up.charAt(0)-'0')-2)*3;
        if(c>=18)
            c++;
        int d=c+3;
        if(c==15||c==22)
            d++;
        for(int i=c;i<d;i++){
            comb(up.substring(1),p+(char)('a'+i));}

    }
}