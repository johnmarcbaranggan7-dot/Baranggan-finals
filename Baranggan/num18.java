
/**
 * Write a description of class num18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num18
{
    public static void main(String [] args){
    int[] arr = {1,2,3,4};
    boolean hasDuplicate = false;
    for(int i = 0; i < arr.length; i++){
        for(int j = i + 1; j < arr.length; j++){
            if(arr[i] == arr[j]){
                hasDuplicate = true;
                break;
            }
        }
        if(hasDuplicate) break;
    }
    System.out.println("Contains Duplicates: " + hasDuplicate);
    
    
    
    
    
    
    
    }
}