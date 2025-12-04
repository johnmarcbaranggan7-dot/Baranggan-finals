
/**
 * Write a description of class num6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num6
{
    public static void main(String [] args){
    int[] arr = {3,5,9,1,2};
    int sum = 0, count = 0;
    for(int n: arr){
        if(n % 2 != 0){
            sum += n;
            count++;
        }
    }
    double average = (count > 0) ? (double)
    sum / count : 0;
    System.out.println("Average of odd numbers: " + average);
    
    
    
    
    
    
    
    
    
    }
}