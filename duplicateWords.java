import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public static void main(String[] args) throws FileNotFoundException{
      Scanner input = new Scanner(new File("words.txt"));
      ArrayList<String> duplicateList = new ArrayList<String>();
      while(input.hasNext()){
        duplicateList.add(input.next());
      }
      input.close();
      System.out.println("List with duplicates: " + duplicateList);
      //if duplicate is found stop looping and remove indexed item
      for(int wordIdx = 0; wordIdx < duplicateList.size() - 1 ; wordIdx++){
        int compareIdx = wordIdx++;
        while(duplicateList.get(wordIdx) != duplicateList.get(compareIdx) && wordIdx != duplicateList.size() - 1){
          compareIdx++;
        }
        if(duplicateList.get(wordIdx) != duplicateList.get(compareIdx)){
          duplicateList.remove(wordIdx);
        }
      }
      System.out.println("List without duplicates: " + duplicateList);
}
          
