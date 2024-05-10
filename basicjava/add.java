
package basicjava;

import java.util.*;

public class add {
   
    
    public static void main(String[] args) {
         try (Scanner in = new Scanner(System.in)) {
            int Num1=in.nextInt();
            int Num2=in.nextInt();
            
            int Sum = Num1+Num2;
                
                System.out.printf("%d",Sum);
        }
    }
    
    
}
