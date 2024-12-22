package Array;

import java.util.Arrays;

public class lab068array {

    public static void main(String[] args) {
        int [] array={44,2,45,6,77,35,76};
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }

        }System.out.println(max);
    }


            }

