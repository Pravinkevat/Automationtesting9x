package switchstatment;

import java.util.Scanner;

public class lab035switch {
    public static void main(String[] args) {
        //java program for simple calculator using switch statement
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=sc.nextInt();
        System.out.println("enter the second number");
        int num2=sc.nextInt();
        System.out.println("enter the operator -> +,-,*,/,%");
        String c=sc.next();
        switch (c){
            case "+":
                System.out.println("your result of addition is"+(num1+num2));
                break;
            case "-":
                System.out.println("your result of subtraction is"+(num1-num2));
                break;
            case "*":
                System.out.println("your result of multipication is"+(num1*num2));
                break;
            default:
                System.out.println("please enter valid operator");
                break;
        }
    }
}
