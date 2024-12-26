package dec.encapsulations;

public class lab086encap {
    public static void main(String[] args) {
        encap2 e2=new encap2("pravin","pass@123");
      String name=  e2.getName(true);
       String pass= e2.getPass();
        System.out.println("name is "+ name);
        System.out.println("pass is "+pass);
        String n=e2.setPass("rajest@123",false);
        System.out.println(n);

    }
}
class encap2{
  private   String name;
    private String pass;

    public String getPass() {
        return pass;
    }

    public String setPass(String pass,boolean admin) {
        this.pass = pass;
        if(admin){
            return pass;
        }

        return "invaid user";
    }

    public String getName(boolean admin) {
        if(admin){
            return  name;
        }
        return "invaid";
    }

    public String setName(String name,boolean Isvalid) {
        this.name = name;
        if(Isvalid) {
            return pass;
        }
        return "invalid user";

    }


    public encap2(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }



}