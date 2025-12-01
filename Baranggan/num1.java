
/**
 * Write a description of class num1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class num1
{
    public static void main(String [] args){
       Scanner input = new Scanner(System.in); 
       int num;   
       do{
           System.out.print("Enter a number between 1 and 100");
           int userInput=input.nextInt();  
    
           if ( num < 1 || num > 100){
               System.out.println("Invalid input. Try again.");
            }
        } while(num < 1 || num > 100);
           System.out.println("Valid num" + num);       
           }
    
    
    
    
    
    }
