
package q6_simple_interest;


public class Q6_Simple_Interest {

   
    public static void main(String[] args) {
        
        int principal=5000;
        double rate=7.5;
        int time=3;
        
        double SI=(principal*rate*time)/100;  
        
        System.out.println("Simple Interest: " + SI);
    }
    
}
