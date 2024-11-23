package Nov23.Nov23functions;

public class lab058func {
    public static void main(String[] args) {
        //type4 with paramater and with return type
        int s=add(7,8);
        System.out.println(s);
        add(5,8);
    }
   static int add(int a, int b){
       System.out.println("hello again"+(a*b));
        return a*b;
   }
}
