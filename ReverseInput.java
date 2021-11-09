/**
 * Write a description of class NumMath here.
 *
 * @author Sarah Pettigrew
 * @version 10/10/2021
 */
import java.util.Scanner;
import java.util.Stack;
public class ReverseInput
{     
    public static void main(String[] args) {
        String regex = "[^a-zA-Z0-9\\-']|^-|-$";
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter words to reverse: (Enter \"STOP\" to exit) ");  
        String userInput = input.nextLine();

        while(!userInput.toUpperCase().equals("STOP")){
            Stack<String> inputStack = new Stack<String>();
       
            String[] userWords = userInput.split("\\s+");
            String reversedUserWords = "";
            
            for(String word:userWords){
                word = word.replaceAll(regex, "");
                if(!word.isEmpty()){
                    inputStack.push(word);
                }  
            }
            
            while(!inputStack.isEmpty()){
                String singleWord = inputStack.pop();
                reversedUserWords += singleWord + " ";
            }
    
            System.out.println("Reversed: " + reversedUserWords.trim() + "\n----------");
            System.out.print("Enter words to reverse: (Enter \"STOP\" to exit) ");  
            userInput = input.nextLine();
        }
        
        input.close();   
    }
}
