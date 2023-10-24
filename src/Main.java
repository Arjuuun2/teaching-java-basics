import sun.nio.cs.ext.SJIS;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] ar){
Scanner in=new Scanner(System.in);
   int[] arr={2,3,45,6,7};


        for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
        }

   System.out.println("array before: "+Arrays.toString(arr));
   changenum(arr);
   System.out.println("array after: "+Arrays.toString(arr));

   /* this is multi line comment in java*/
        //this is single line comment in java
        //So guys today we are learning about if conditionals
        int salary=5000;
        if(salary>10000){
            salary += 2000;
        } else if (salary>20000) {
            salary +=3000;
        }else {
            salary=1000;

            //store 5 roll numbers using array
            int[] rno=new int[5];
            int count=1;
            for(int i=0;i<5;i++){
                rno[i]=count;
                count++;
            }
            for(int p=0;p<rno.length;p++){
                System.out.println(rno[p]);
            }
        }
        //string array input
        String[] str=new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));
    }
    static void changenum(int[] num){
        num[0]=33;
    }

}