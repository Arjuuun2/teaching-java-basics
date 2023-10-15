import java.util.Scanner;

public class IsPrimeOrNot {
    public static void main(String[] ar){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        boolean result=isPrime(n);
        System.out.println(result);

    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
