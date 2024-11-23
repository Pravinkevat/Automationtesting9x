package oct2011loopsdowhile;

import java.util.Scanner;

public class lab051dowhilereversenum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  positive number more than 1 digit ");
        int n=sc.nextInt();
        int b=n/10;

        do{
            System.out.println(b);
            b++;
        }
        while (b==n);
    }
}
