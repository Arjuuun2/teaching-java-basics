import sun.nio.cs.ext.SJIS;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] ar){

   int[] arr={2,3,45,6,7};


        for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
        }

   System.out.println("array before: "+Arrays.toString(arr));
   changenum(arr);
   System.out.println("array after: "+Arrays.toString(arr));
    }
    static void changenum(int[] num){
        num[0]=33;
    }

}