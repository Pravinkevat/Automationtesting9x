package Nov23.Nov23functions;

import java.util.Scanner;

public class lab059func {
    public static void main(String[] args) {
 //program for simple calculate using function and taking inpur from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        double x=sc.nextDouble();
        System.out.println("enter the second number");
        double y=sc.nextDouble();
        System.out.println("enter your choice 1 for addition , 2-subtraction , 3-multiplication , 4-division");
        int choice= sc.nextInt();
        switch (choice){
            case 1:
                add(x,y);
                break;
            case 2:
                sub(x,y);
                break;
            case 3:
                multi(x,y);
                break;
            case 4:
                div(x,y);
                break;
            default:
                System.out.println("please enter your choice between 1-4 only");
                break;
        }
           // add(x,y);
           // sub(x,y);
           // multi(x,y);
           // div(x,y);
    }

    static void add(double a, double b){
        System.out.println("addition of "+a+ " and "+b+" is "+(a+b));
    }

    static void sub(double a, double b){
        System.out.println("subtraction  of "+a+ " and "+b+" is "+(a-b));
    }
    static void multi(double a, double b){
        System.out.println("multiplication   of "+a+ " and "+b+" is "+(a*b));
    }
    static void div(double a, double b){
        System.out.println("division  of "+a+ " and "+b+" is "+(a/b));
    }
}
