package Automationtesting9xifelse;

import java.util.Scanner;

public class lab033ifelsegrad {
    public static void main(String[] args) {
        //write a java program for grad calculation using if else statement
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        double d=sc.nextDouble();
        if(d>=90 ){
            System.out.println("grad is A");
        } else if (d>=80) {
            System.out.println("grad is B");

        } else if (d>=70) {
            System.out.println("grad is C");

        }else if (d>=60){
            System.out.println("grad is D");
        }
        else {
            System.out.println("you are fired");
        }
    }
}
