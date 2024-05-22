
package basicjava;


public class Testuser {
    public static void main(String[] args) {
        User sourav=new User("Sourav",2002);
        
        int result=sourav.birthyear(2024);
        System.out.println("Age is :"+result);
    }
    
}
