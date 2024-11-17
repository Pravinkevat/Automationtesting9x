package Automationtesting9xifelse;

import java.util.Scanner;

public class lab033ifelsegrad {
    public static void main(String[] args) {
        //write a java program for grad calculation using if else statement
        // Write a program that calculates and displays the letter grade
// for a given numerical score (e.g., A, B, C, D, or F)
// based on the following grading scale:
//
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        double d=sc.nextDouble();
        if(d>=90 && d<=100 ){
            System.out.println("grad is A");
        } else if (d>=80 && d<90) {
            System.out.println("grad is B");

        } else if (d>=70 && d<80) {
            System.out.println("grad is C");

        }else if (d>=60 && d<70){
            System.out.println("grad is D");
        }
        else if(d>=0 && d<60){
            System.out.println("you are fail");
        }
        else {
            System.out.println("please enter the number between 0-100");
        }
    }
}
