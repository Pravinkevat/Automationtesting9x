package operators;

public class lab017 {
    public static void main(String[] args) {
//        && !,||
        // logical operator
        boolean a=true;
        boolean b=false;
        boolean c=a&&b;
        boolean d=a||b;

        System.out.println(c);
        System.out.println(d);
        System.out.println(!a);
        System.out.println(!b);
        System.out.println(!!a);
        System.out.println(!!b);
    }
}
