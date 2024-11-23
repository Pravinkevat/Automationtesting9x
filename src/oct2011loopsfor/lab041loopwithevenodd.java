package oct2011loopsfor;

public class lab041loopwithevenodd {
    public static void main(String[] args) {
        //java program to find even odd number using for loop
        for(int i=0;i<=100;i++){
            if(i%2==0){
                System.out.println("even number\t"+i);
            }
            else {
                System.out.println("odd number\t"+i);
            }
        }
    }
}
