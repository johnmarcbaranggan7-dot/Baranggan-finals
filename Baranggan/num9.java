
/**
 * Write a description of class num9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class num9
{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int num, sum = 0;
    
    while(true){
        System.out.print("Enter number: ");
        num = sc.nextInt();
        
        if (num == 0) break;
        sum += num;
    }
    System.out.println("Sum = " + sum);
    
    
    
    
    
    
    
    
    
    }
}