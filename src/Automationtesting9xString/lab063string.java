package Automationtesting9xString;

public class lab063string {
    public static void main(String[] args) {
        String s1="pravin";
        String s2="PRAVIN";
        String s3="Hellomy name is pravin kevat";
        s1=s1.toUpperCase();
        System.out.println(s1);
        s2=s2.toLowerCase();
        System.out.println(s2);
        s3=s3.substring(4,9);
        System.out.println("substring is "+ s3);
    }
}
