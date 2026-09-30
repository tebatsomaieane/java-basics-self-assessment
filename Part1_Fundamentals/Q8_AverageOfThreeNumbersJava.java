
package q8_averageofthreenumbers.java;
import java.util.Scanner;

public class Q8_AverageOfThreeNumbersJava {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter first Number: ");
        double first=input.nextDouble();
         
        System.out.print("Enter Second Number: ");
        double second=input.nextDouble();
        
        System.out.print("Enter Third Number: ");
        double third=input.nextDouble();
        
        double average=(first+second+third)/3;
        
        System.out.println("Average of three numbers is: "+average);  
        
    }
    
}
