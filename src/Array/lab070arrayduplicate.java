package Array;

public class lab070arrayduplicate {
    public static void main(String[] args) {
        int [] num={22,4,33,22,44,22,4};
        int dup=num[0];
        for (int i=0;i<num.length;i++){
            if(num[i]==dup){
                dup=num[i];
                System.out.println(dup);
            }
        }
    }
}
