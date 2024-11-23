package Nov23.Nov23functions;

import java.util.Scanner;


import static java.lang.Math.*;

public class lab053functions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        int result =max(a,b);
        int min=min(a,b);
        int mul= multiplyExact(a,b);
        System.out.println(result+"\n"+min+"\n"+mul);
    }
}
