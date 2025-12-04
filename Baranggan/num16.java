
/**
 * Write a description of class num16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class num16
{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int num = sc.nextInt();
    
    int count = 0;
    int temp = Math.abs(num);
    
    while(temp > 0) {
        temp /= 10;
        count++;
    }
    
    System.out.println("Digits: " + count);
    
    
    
    
    
    
    }
}