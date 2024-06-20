import java.util.*;
public class reverse {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i,j = 0;
    while(n!=0){
    i = n%10;
    n = n/10;
    j = j*10 + i;
    }
    System.out.print("reverse of the number is:" + j);
    }
    
}
