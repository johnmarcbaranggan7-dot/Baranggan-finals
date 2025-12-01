
/**
 * Write a description of class num2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num2
{
    public static void main(String [] args){
    
    int[] numbers = {1,3,7,2,8,6,7,9,4,7};
    int count = 0;
    for(int num : numbers) {
        if (num == 7) {
            count++;
    }
}   
        System.out.print("the number 7 appears " + count + " times.");
        
        
    }
}