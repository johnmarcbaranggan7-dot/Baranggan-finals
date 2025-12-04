
/**
 * Write a description of class num10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num10
{
    public static void main(String [] args){
    int[] arr = {2,4,6,8,9};
    int index = -1;
    for(int i = 0; i < arr.length; i++){
        if (arr[i] % 2 == 0){
            index = i;
            break;
        }
    }
    System.out.println("First even index: " + index);
    
    
    
    
    }
}