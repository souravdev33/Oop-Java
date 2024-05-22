
package basicjava;


public class Constructor {
    
    private String name;
    private int age;
    
    Constructor(){
        System.out.println("Hello world");
    }
    
    public String getname(){
        return name;
        
    }
    
    public void set(String name){
        this.name=name;
    }
    
    
}
