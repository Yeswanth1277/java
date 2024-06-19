import java.util.*;
public class functions {
    // public static void pro(int a, int b){
    // int mul = a*b;
    // System.out.println(mul);
    // }

    // public static void fac(int n){
    //     int i, f = 1;
    //     for(i = 1; i <= n; i++){
    //         f = f*i;
    //     }
    //     System.out.println(f);
    // }

    public static void primeno(int p, boolean p1){
        
        int i;
        for(i = 2; i < p; i++){
            if(p%i == 0){
                p1 = false;
            }
        }

        if(p1 == true){
            System.out.println("The entered number is a prime number");
        }
        else if(p1 == false){
            System.out.println("The entered number is not a prime number");
        }
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int n = sc.nextInt();
    // pro(a, b);
    // fac(n);
    int p = sc.nextInt();
    boolean p1 = true;
    primeno(p, p1);
    
    }
    
}
