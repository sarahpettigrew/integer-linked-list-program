/**
 *
 * @author Sarah Pettigrew
 * @version 11/15/2021
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class MainNumbers
{   
    public static void main(String[] args) throws FileNotFoundException{
        //fill LinkedList with numbers from file
        //call methods from LinkedList class
        //print results to console
        File nums = new File("IINums.txt");
        Scanner input = new Scanner(nums);
        IntegerLinkedList intLL = new IntegerLinkedList();
        int count = 0;
        while (input.hasNext()){
            intLL.addNum(Integer. parseInt(input.next()));
        }  
        System.out.println("The numbers in the list are: " + intLL.show());
        System.out.println("The largest number is: " +  intLL.largestNum());
        System.out.println("The smallest number is: " + intLL.smallestNum());
        System.out.println("The average of the numbers is: " + intLL.calculateAvg());
    }

}