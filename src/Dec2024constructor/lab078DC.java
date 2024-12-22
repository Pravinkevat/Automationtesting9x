package Dec2024constructor;

import java.util.Scanner;

public class lab078DC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the model number of car");
        String modelno=sc.next();
        System.out.println("enter the year of car");
        int year=sc.nextInt();


        car2 c2=new car2(modelno,year);
        System.out.println(c2.model_name+ c2.year);


        car2 c3=new car2("XNE244", 2024);
        System.out.println(c3.model_name+c3.year);
    }
}


