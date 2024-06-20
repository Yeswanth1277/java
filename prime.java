import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j = 0;
        
        for(i = 2; i < n; i++){
            if(n%i == 0){
                j = 1;
            }
            
        }
        if(j == 0){
            System.out.println("The entered number is a prime number");
        }
        else if(j == 1){
            System.out.println("The entered number is not a prime number");
        }
    }
    
}
