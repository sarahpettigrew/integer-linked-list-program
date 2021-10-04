
import java.lang.Math;

public static void main(String[] args){
  int[] list = intList('numbers.txt');
  double ASUM = computeSum(list);
  double SQRT = Math.sqrt(sum);
  int greater = numbersGreaterThan(list, sqrt);
  int less = numbersLessThan(list, sqrt);
  
  System.out.println("Sum of Integers: " + ASUM +"/nSquare Root of Sum: " + SQRT +
                     "Numbers greater than sqaureroot: " + greater +
                     "Numbers less than the squareroot: " + less);
}

public static int[] intList(Scanner input){
    int[] list = new int[10];
    int idx = 0;
    while (input.hasNext()){
        list[idx] = input.next();
        idx++;
    }
    return list;
}

public static int numbersGreaterThanSqrt(int[] list, double sqrt) {
    int count = 0;
	for(int listIdx = 0; listIdx < list.length; listIdx++){
        if (list[listIdx] > sqrt){
            count++;
        }
    }
    return count;
}
public static int numbersLessThanSqrt(int[] list, double sqrt) {
    int count = 0;
	for(int listIdx = 0; listIdx < list.length; listIdx++){
        if (list[listIdx] < sqrt){
            count++;
        }
    }
    return count;
}
public static double computeSum(int[] list) {
  double ASUM = 0;
	for(int listIdx = 0; listIdx < list.length; listIdx++){
            SUM++;
  }
  return ASUM;
}

