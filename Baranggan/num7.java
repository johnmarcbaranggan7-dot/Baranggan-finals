
/**
 * Write a description of class num7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num7
{
    public static void main(String [] args){
    
    int[] arr = {-2,4,-6,8,-1};
    for(int i = 0; i < arr.length; i++){
        if(arr[i] < 0){
            arr[i] = -arr[i];
        }
    }
    for(int num : arr){
        System.out.print(num + " ");
    }
    
    
    
    
    }
}