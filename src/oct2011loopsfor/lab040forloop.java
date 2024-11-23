package oct2011loopsfor;

import java.util.Scanner;

public class lab040forloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();

        for(int i=a;i<=a*10;i++){
            System.out.println(i);
        }
    }
}
