/**
 * @author Sarah Pettigrew
 * @version 11/09/2021
 */
import java.util.Scanner;
import java.util.Stack;
public class ReverseInput2
{     
    public static void main(String[] args) {
        String regex = "(?!.*([^a-zA-Z0-9\\-']|^-|-$)).*";
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter words to reverse: ");  
        String userInput = input.nextLine();
        Stack<String> inputStack = new Stack<String>();
        String[] userWords = userInput.split("\\s+");
        String reversedUserWords = "";
        
        for(String word:userWords){
            //word = word.replaceAll(regex, "");
            
            if(word.matches(regex)){
                inputStack.push(word);
            }  
        }
        
        while(!inputStack.isEmpty()){
            String singleWord = inputStack.pop();
            reversedUserWords += singleWord + " ";
        }

        System.out.println("Reversed: " + reversedUserWords.trim() + "\n----------");
        
        input.close();   
    }
}
