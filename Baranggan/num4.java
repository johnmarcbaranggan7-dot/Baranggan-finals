
/**
 * Write a description of class num4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num4
{
    public static void main(String [] args){
    
    int[] nums = {5,9,2,7,6,3};
    
    int min = nums[0];
    int max = nums[0];
    
    for (int i = 1; i < nums.length; i++) {
        if(nums[i] < min){
            min = nums[i];
        }
        if(nums[i] > max){
            max = nums[i];
        }
    }
    System.out.println("Smallest: " + min);
    System.out.println("Largest: " + max);
    }
}