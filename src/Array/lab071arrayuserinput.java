package Array;

import java.util.Scanner;

public class lab071arrayuserinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array");
        int size=sc.nextInt();
        int[]num=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("enter the number");
            num[i]=sc.nextInt();
        }
        for (int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }

    }
}
