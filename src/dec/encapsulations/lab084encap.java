package dec.encapsulations;

public class lab084encap {
    public static void main(String[] args) {
        login l=new login("admin","stu@123");
     //   System.out.println(l.username);
       // System.out.println(l.password);
      //  System.out.println(l.password="hacer");
       String reult= l.display(false);
     //   System.out.println(l.display("test","3r3r3"));
        System.out.println(reult);
    }
}
class login{
   private String username;
   private   String password;

   public login(String username, String password){
        this.username=username;
        this.password=password;
    }

    public String display(boolean is_valid){
       if(is_valid){
           return password;
       }
        return "null";
    }
}
