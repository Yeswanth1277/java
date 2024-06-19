import java.util.*;
public class areas {    
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    float r = sc.nextFloat();
    float area1, area2;
    area1 = 3.14f*r*r;
    area2 = r*r;
    System.out.println("area of circle:");
    System.out.println(area1);
    System.out.println("area of square:");
    System.out.println(area2);
    }
    
}
