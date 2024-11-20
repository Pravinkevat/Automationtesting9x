package switchstatment;

import java.util.Scanner;

public class lab037switchmonth {
    public static void main(String[] args) {
        //java program to print month name if user enter value from 1-12
        //1-january, 2-feburary, 3-march, 4-april, 5-may, 6- june, 7-july,8-august,9-september ,10-october ,11, november,12-december
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number between 1-12");
        int num=sc.nextInt();
        switch (num){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("please enter number between 1-12 only without pointer");
                break;

        }

    }
}
