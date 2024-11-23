package oct2011loopswhile;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class lab047while {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
        System.out.println("enter the number more than 20");
        int n=sc.nextInt();
        while (n>20){
            System.out.println(n);
            n--;
        }



   }}