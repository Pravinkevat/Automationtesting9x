package typecasting;

public class lab024typecasting {
    public static void main(String[] args) {
//        widnning
        byte b=10;
        int a=b;
        int c=(int)b;
        System.out.println(a);
        System.out.println(c);
        
        //narowwing
        int d=127;
        //byte f=d;
        byte f=(byte)d;
        System.out.println(f);

    }
}
