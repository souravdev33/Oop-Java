
package basicjava;


public class User {
    
    String name;
    int Birthyear;
    
    User(String name,int Birthyear){
        this.name=name;
        this.Birthyear=Birthyear;
    }
    
    int birthyear(int Thisyear)
    {
        int age= Thisyear-Birthyear;
        return age;
    }
    
    
}
