package dec.encapsulations;

public class lab085encap {
    public static void main(String[] args) {
        encap e= new encap("pravin","pra@123");
       // System.out.println(e.pass);
       // System.out.println(e.name);
        String p=e.display(true);
        System.out.println(p);

    }
}
class encap{
  private   String name;
   private String pass;


public   encap(String name, String pass) {
    this.name = name;
    this.pass = pass;


}
public String display(boolean is_valid){
    if(is_valid) {
        return pass;
    }
    return "invalid";
}
}