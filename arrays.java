// import java.util.*;
// public class arrays {
//     public static void main(String args[]){
//         int marks[] = new int[50];
//         int i;

//         Scanner sc = new Scanner(System.in);
//         for(i = 1; i <= 3; i++){
//             marks[i] = sc.nextInt();
//         }

//         for(i = 1; i <= 3; i++){
//             System.out.println(marks[i]);
//         }

//     }
    
// }

import java.util.*;
public class arrays {
    public static void main(String args[]){
        int i, temp;
        int f = 0, l = 3;
        int num[] = {1,2,3,4};
        while(f < l){
            temp = num[f];
            num[f] = num[l];
            num[l] = temp;
            f++;
            l--;
        }

        for(i = 0; i < 4; i++){
        System.out.print(num[i]);
    }


    }
}