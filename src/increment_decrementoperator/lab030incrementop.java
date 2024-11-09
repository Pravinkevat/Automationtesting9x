package increment_decrementoperator;

public class lab030incrementop {
    public static void main(String[] args) {
        System.out.println("this program is for increment decrement operator");
        //pre increment
        int a=10;
        int result=++a;
        System.out.println("this is the example of pre increment"+result);
        System.out.println("this is the example of pre increment"+a);

        int b=30;
        int output=b++ + ++b;
        System.out.println(output);
        System.out.println(b);


    }
}
