package operators;

public class lab015 {
    public static void main(String[] args) {
        String f_name="Pravin";
        String l_name="kevat";
        int a=12;int b=45;

        System.out.println(f_name+l_name+a+b);
//        this will act as a concatination
        System.out.println(a+b+f_name+l_name);
//        this will be first math then concatination
        System.out.println(f_name+l_name+(a+b));
// bodmas
    }
}
