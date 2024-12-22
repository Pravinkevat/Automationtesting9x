package Array;

public class lab069arraymin {
    public static void main(String[] args) {
        int [] num={44,55,3,5,33,55,6,44};
        int minimum=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]<minimum){
                minimum=num[i];
            }
        }
        System.out.println(minimum);
    }
}
