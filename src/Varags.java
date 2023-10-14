import java.util.Arrays;

public class Varags {
    public static void main(String[] ar){
       fun(3,5,55,6,9);
       //add(3,4,5,6,7,7);
       //calling the method overloading function
        demo(3,4,5,6);
        demo("super","star","rajani","kant");
System.out.println("heello world.!!1");

    }
    //showing examples of method overloading
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
//this is version 1.1

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void add(int ...v){
        for(int i=0;i<v.length;i++){
            System.out.println(v[i]=v[i]+v[i+1]);
        }
    }
}
