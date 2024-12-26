package dec.polymorphism;

public class lab082polymorphsm {
    public static void main(String[] args) {

math m1=new math();
        System.out.println(m1.add(3,5));
        System.out.println(m1.add(4.5,3.0));
        m1.add();
    }
}
class math{
    int   add(int a, int b){
        return a+b;

    }
    double add(double a, double b){
        return a+b;
    }
    void add(){
        System.out.println("jai shree ram");
    }
}