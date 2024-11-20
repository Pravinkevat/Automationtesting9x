package switchstatment;

import java.util.Scanner;

public class lab038switchkmtom {
    public static void main(String[] args) {
        //Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
        //Input. -
        //choice - 1 - km → m, km → 1km
        //choice - 2 - f → c, f → c
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the positive number number ");
        double d=sc.nextDouble();
        System.out.println("enter your choice 1 or 2 , 1-KM-M, 2 f-c");
        int ch=sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("you have selected choice 1 , you want to convert KM to M");
                System.out.println("your result is"+(d*1000));
                break;
            case 2:
                System.out.println("you have selected choice 2 , you want to convert feet to centimeter");
                System.out.println("your result is "+(d*30.48));
                break;
            default:
                System.out.println("please enter choice 1 or 2 only");
                break;
        }
    }
}
