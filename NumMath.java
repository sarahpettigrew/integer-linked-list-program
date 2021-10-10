
/**
 * Write a description of class NumMath here.
 *
 * @author Sarah Pettigrew
 * @version 10/10/2021
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class NumMath
{   
    public static void main(String[] args) throws FileNotFoundException{
      int[] nums = new int[10];
      Scanner input = new Scanner(new File("nums.txt"));
      createArray(input, nums);
      int ASUM = sumArray(nums);
      double SQRT = Math.sqrt(ASUM);
      int greater = numsGreaterThan(SQRT, nums);
      int less = numsLessThan(SQRT, nums);
      
      System.out.println("Results: " + "\nSUM: " + ASUM +"\nSQRT: " + SQRT +
                         "\nNumbers less than SQRT: " + less +
                         "\nNumbers greater than SQRT: " +
                         greater);
      
    }
    
    public static void createArray(Scanner input, int[] nums){
        int count = 0;
        while (input.hasNext()){
            nums[count] = Integer. parseInt(input.next());
            count++;
        }
    }
    
    public static int sumArray(int[] nums)
    {
        int ASUM = 0;
        for(int num = 0; num < nums.length; num++){
            ASUM += nums[num];
        }
        return ASUM;
    }

    public static int numsGreaterThan(double SQRT, int[] nums)
    {
        int greater = 0;
        for(int num = 0; num < nums.length; num++){
            if(nums[num] > SQRT){
                greater++;
            }
        }
        return greater;
    }

    public static int numsLessThan(double SQRT, int[] nums)
    {
        int less = 0;
        for(int num = 0; num < nums.length; num++){
            if(nums[num] < SQRT){
                less++;
            }
        }
        return less;
    }
}
