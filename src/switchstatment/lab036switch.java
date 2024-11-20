package switchstatment;

import java.util.Scanner;

public class lab036switch {
    public static void main(String[] args) {
        //java program to print weekdays if user enter value from 1-7 using switch operator
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number between 1 to 7: 1- monday, 2-tuesday,3 wednessday, 4-thursday, 5-friday,6-saturday, 7-sunday");
        int days=sc.nextInt();
        switch (days){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("please enter number between 1 to 7 only");
                break;
        }
    }
}
