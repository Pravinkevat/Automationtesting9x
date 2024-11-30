package Automationtesting9xString;

public class lab064string {
    public static void main(String[] args) {
        String s1="Banana, mango, watermelon, orange, apple ";

        String [] s2=s1.split(",");
        System.out.println(s2[0]);
        System.out.println(s2[1]);
        System.out.println(s2[2]);
        System.out.println(s2[3]);
        System.out.println(s2[4]);
    }
}
