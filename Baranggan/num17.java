
/**
 * Write a description of class num17 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num17
{
    public static void main(String [] args){
    int[] arr = {2,16,87,23,12};
    int highest = arr[0];
    int second = arr[0];
    
    for(int n : arr){
        if(n > highest){
            second = highest;
            highest = n;
        } else if (n > second && n != highest)
    {
        second = n;
    }
    }
    System.out.println("Second highest: " + second);
    
    
    
    
    }
}