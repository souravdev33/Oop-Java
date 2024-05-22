//This is the code for encapsulation
package basicjava;


public class Person {
    
    private String name;
    
    //getter
    
    public String getname(){
        return name;
    }
    
    //setter
    
    public void setname(String name){
        this.name=name;
    }
    
    public static void main(String[] args) {
        
        Person num1=new Person();
        
        num1.setname("Sourav Dev");
        
        System.out.println("Name is : "+num1.getname());
        
    }
    
}
