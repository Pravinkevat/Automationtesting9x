package Dec2024constructor;

public class lab077constructor {
    public static void main(String[] args) {
        car c1= new car();
        System.out.println(c1.carname);
        System.out.println(c1.year);
        System.out.println(c1.modelno);
        car c2=new car();
        c2.carname="Mahindra";
        System.out.println(c2.carname);
    }
}
