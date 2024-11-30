package Automationtesting9xString;

public class lab066string {
    public static void main(String[] args) {
        String s1="Pravin";
        String s2="kevat";
        s1=s1.concat("kevat").concat("ji");
        System.out.println(s1);

        System.out.println(s1.charAt(3));
        String s3="pravin kevat    ";
        System.out.println(s3.trim());
        System.out.println(s1.indexOf("a"));
        System.out.println(s1.contains("ap"));
        System.out.println(s3.lastIndexOf("a"));
        System.out.println(s3.replace("a","s"));
        System.out.println(s3.startsWith("p"));
        System.out.println(s3.endsWith("p"));
    }
}
