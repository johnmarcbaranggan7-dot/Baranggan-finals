
/**
 * Write a description of class num12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num12
{
    public static void main(String [] args){
    int[] arr = {2,4,2,8,2};
    int value = 2;
    int count = 0;
    for(int n : arr){
        if(n == value) count++;
    }
    if(count >= 3)
    System.out.println("it appears 3 times");
    else System.out.println("Does not appear 3 times");   
    }
}