public class LocalandGlobalVariable {
   static int var1;
   static int var2=67;
    public static void main(String[] args) {
        int a;
        int b=39;
        System.out.println(var1);  //---> Global variable not required to initialize .
        System.out.println(var2);
//        System.out.println(a);   ---> Local variable must to initialize.
        System.out.println(b);
    }
}
