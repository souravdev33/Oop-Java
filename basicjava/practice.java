package basicjava;

/**
 *
 * author: ASUS VIVO BOOK
 */
public class practice {
    public static void main(String[] args) {
        // Create an instance of the Practice class
        practice obj = new practice();
        
        // Use parentheses to group the operation before casting
        obj.result = (double) (8 / 5);
        
        // Print the result using the object reference
        System.out.println(obj.result);
    }
    
    // Declare the 'result' variable at the class level
    double result;
}
