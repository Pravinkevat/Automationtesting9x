package Nov23.Nov23functions;

import java.util.Scanner;

public class lab054fun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        add(a,b);
    }
    public static void add(int a, int b){
       int addition=a+b;
        System.out.println("addition"+addition);
    }
}
