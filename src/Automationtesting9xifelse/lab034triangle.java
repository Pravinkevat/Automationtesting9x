package Automationtesting9xifelse;

import java.util.Scanner;

public class lab034triangle {
    public static void main(String[] args) {
        //Triangle Classifier:

        //Write a program that classifies a triangle based on its side lengths.

        //Given three input values representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal), or scalene (no sides are equal). Use an if-else statement to classify the triangle.

        // side1, side2, side2 → eq, iso, scalene
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first slide");
        double slide1=sc.nextDouble();
        System.out.println("enter the second slide");
        double slide2=sc.nextDouble();
        System.out.println("enter the third slide");
        double slide3=sc.nextDouble();

        if (slide1==slide2 && slide2==slide3){
            System.out.println("this is scalean");
        } else if (slide1==slide2 || slide1==slide3 || slide2==slide3) {
            System.out.println("any two sides are same");

        }
        else {
            System.out.println("all are different");
        }
    }
}
