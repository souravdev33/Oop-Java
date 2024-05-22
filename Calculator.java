
package basicjava;

public class Calculator {
    
    private int num1,num2;
    
    Calculator(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    
    void add(){
        System.out.println(num1+num2);
    }
    
}
