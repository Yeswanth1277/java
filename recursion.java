import java.util.*;
public class recursion{
    public static void main(String args[]){
    //   int n = 10;
    int fact;
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // sumN(n);
        System.out.println(sumN(n));

    }

    public static void rec(int n){

        if(n == 1){
            System.out.println(n);
        }
        else{
        System.out.println(n);
        rec(n-1);
        }
    }

    public static int fac(int n){
        if(n==0){
            return 1;
        }

        int fact,f;
       f = fac(n-1);
       fact = n*f;
       return fact;

    }

    public static int sumN(int n){
        if(n==1){
            return 1;
        }

        int sum, s;
        s = sumN(n-1);
        sum = n + s;
        return sum;
    }

    public static int fib(int n){
        
    }
}