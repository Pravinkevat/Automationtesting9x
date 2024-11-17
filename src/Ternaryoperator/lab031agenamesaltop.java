package Ternaryoperator;

import java.util.Scanner;

public class lab031agenamesaltop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name\n");
        String name=sc.next();
        System.out.println("enter the age");
        double age=sc.nextDouble();
        System.out.println("enter your salary");
        double sal=sc.nextDouble();
        System.out.println("Dear "+name+" your age is "+age+ "and Salary is "+sal);
    }
}
