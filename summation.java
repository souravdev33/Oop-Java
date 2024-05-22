
package basicjava;

import java.util.*;
public class summation {
    public static void main(String[] args) {
        long number1,number2;
        System.out.print("ENter the number 1 & 2 : ");
        Scanner input=new Scanner(System.in);
        number1=input.nextInt();
        number2=input.nextInt();
        
        System.out.printf("The summation is: %d",number1+number2);
    }
    
}
