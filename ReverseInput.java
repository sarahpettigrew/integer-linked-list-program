/**
 * @author Sarah Pettigrew
 * @version 11/09/2021
 */
import java.util.Scanner;
import java.util.Stack;
public class ReverseInput
{     
    public static void main(String[] args) {
        /*the following regex checks for all characters that are not alphanumerics, hyphens,
          or apostrophes, and then checks for starting or ending hypens. */
        String regex = "[^a-zA-Z0-9\\-']|^-|-$";
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter words to reverse: ");  
        String userInput = input.nextLine();
        input.close();

        Stack<String> inputStack = new Stack<String>();
        String[] userWords = userInput.split("\\s+");
        String reversedUserWords = "";
        
        for(String word:userWords){
            /*all characters in the word that are not alphanumerics, hyphens,
              or apostrophes, or are starting or ending hypens are replaced by 
              an empty character. Only words containing characters after this 
              are added to the returned String */

            word = word.replaceAll(regex, "");
            if(!word.isEmpty()){
                inputStack.push(word);
            } 
            /* In this use of a regex check, all peculiar punctuation is being 
               removed from the word being added to the returned String. In this
               way, strange output could occur if the user entered a word. For example,
               "th!s" would return "ths" or "R%#g12h&*" would return "Rg12h". If 
               the desired output of the program was to remove full words containing 
               peculiar punctuation (i.e. "th!s" or "R%#g12h&*") then I would use 
               the following regex:
                    String regex = "(?!.*([^a-zA-Z0-9\\-']|^-|-$)).*";
               and instead of using replaceAll(), I would use the following:
                    if(word.matches(regex)){
                        inputStack.push(word);
                    }
                in this way, a string containing a word such as "th!s" or "R%#g12h&*" 
                would simply not add the word into the returned String.*/ 
        }
        
        while(!inputStack.isEmpty()){
            String singleWord = inputStack.pop();
            reversedUserWords += singleWord + " ";
        }

        System.out.println("Reversed: " + reversedUserWords.trim());  
    }
}
