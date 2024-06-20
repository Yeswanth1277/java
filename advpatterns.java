// Reverse triangle with numbers
import java.util.*;
public class pattern {
    public static void main(String args[]){
        int i, j;
        
        for(i = 1; i <= 5; i++){
            int k = 1;
            for(j = 1; j <= 6 - i; j++){
                
                System.out.print(k);
                k++;
            }
                for(j = 1; j <= i; j++){
                    System.out.print(" ");
                }
                
            
            System.out.println();
        }
    }
    
}

// Floyds triangle:
public class pattern {
    public static void main(String args[]){
        int i, j, k = 1;
        
        for(i = 1; i <= 5; i++){
            for(j = 1; j <= i; j++){
                
                System.out.print(k + " ");
                k++;
            }
                 for(j = 1; j <= i; j++){
                     System.out.print("*");
                 }
                
            
            System.out.println();
        }
    }
    
}


// 01 half-pyramid
//say n=5
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
public class pattern {
    public static void main(String args[]){
        int i, j;
        
        for(i = 1; i <= 5; i++){
            for(j = 1; j <= i; j++){
                
                if((i + j)%2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
                
            
            System.out.println();
        }
    }
    
}

// Butterfly pattern
public class pattern {
    public static void main(String args[]){
        int i, j;
        
        for(i = 1; i <= 4; i++){
            for(j = 1; j <= i; j++){
                
                System.out.print("*");
            }
                for(j = 1; j <= 2*(4 - i); j++){
                    System.out.print(" ");
                }

                for(j = 1; j <= i; j++){
                
                    System.out.print("*");
                }
                System.out.println();
            }
                        

                for(i = 4; i >= 1; i--){
                    for(j = 1; j <= i; j++){
                
                        System.out.print("*");
                    }
                        for(j = 1; j <= 2*(4 - i); j++){
                            System.out.print(" ");
                        }
        
                        for(j = 1; j <= i; j++){
                        
                            System.out.print("*");
                        }
                        System.out.println();
                }
                
            
            System.out.println();
        }
    
    
}

// Solid parallelogram
public class pattern {
    public static void main(String args[]){
        int i, j;
        for(i = 1; i <= 5; i++){
        for(j = 1; j <= 5 - i; j++){
                
                
            System.out.print(" ");
        }

        
            for(j = 1; j <= 5; j++){
                
                
                System.out.print("*");
            }

            
                
            
            System.out.println();
        }
    }
    
}

// Hollow parallelogram 
public class pattern {
    public static void main(String args[]){
        int i, j, r = 5, c = 5;
        for(i = 1; i <= 5; i++){
        for(j = 1; j <= 5 - i; j++){
                
                
            System.out.print(" ");
        }

        
            for(j = 1; j <= 5; j++){
                if(i == 1 || i == r || j == 1 || j == c){
                                  System.out.print("*");
                   }
                   else{
                    System.out.print(" ");
                   }
                
                
                
            }

            
                
            
            System.out.println();
        }
    }
    
}

// Solid rhombus or diamond
class pattern {
    public static void main(String args[]){
        int i, j;
        
        for(i = 1; i <= 4; i++){
            for(j = 1; j <= 4 - i; j++){
                System.out.print(" ");
            }
            for(j = 1; j <= 2*i - 1; j++){
                
                System.out.print("*");
            }
                
                System.out.println();
            }
                        

                for(i = 4; i >= 1; i--){
                    for(j = 1; j <= 4 - i; j++){
                        System.out.print(" ");
                    }
                    for(j = 1; j <= 2*i - 1; j++){
                        
                        System.out.print("*");
                    }
                        
                        System.out.println();
                    
                        
                }
                
            
            System.out.println();
        
    
    
}
}

