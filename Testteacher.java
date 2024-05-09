
package oop;


public class Testteacher {
    public static void main(String[] args){
        Teacher teacher1; // here i decleared the object
        teacher1 = new Teacher();
        
        teacher1.name = "Sourav Dev";
        teacher1.gender ="Male";
        teacher1.number = 1571151411;
        
        System.out.println("Name : "+teacher1.name);
        System.out.println("Gender : "+teacher1.gender);
        System.out.println("Number : "+teacher1.number);
        
        System.out.println("\n\n");
        
        Teacher teacher2;
        teacher2=new Teacher();
        
        teacher2.name ="Tanmoy Dutta";   
        teacher2.gender ="Male";
        teacher2.number = 1645350942;
        
        System.out.println("Name : "+teacher2.name);
        System.out.println("Gender : "+teacher2.gender);
        System.out.println("Number : "+teacher2.number);
        
        
        
    }
    
}
