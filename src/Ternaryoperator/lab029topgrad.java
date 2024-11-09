package Ternaryoperator;

public class lab029topgrad {
//    if num >=90 then grad is a
//    if number is >=80<90 then grad is b
//    if nubmber is >=70 and less than 80 than c
//    if num is >=60 and less than 70 than d
public static void main(String[] args) {
    int num=78;
    String S=num>=90?"a":(num>=80?"b":(num>=70?"c":(num>=60?"d":"congractulations you are fail")));
    System.out.println(S);
}
}
