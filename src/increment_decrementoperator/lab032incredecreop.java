package increment_decrementoperator;

public class lab032incredecreop {
    public static void main(String[] args) {
        int a=20;
        int b=40;
        int result= ++a - b-- + --a + ++b;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}
