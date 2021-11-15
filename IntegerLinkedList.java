/**
 *
 * @author Sarah Pettigrew
 * @version 11/15/2021
 */
public class IntegerLinkedList {
    Node head;
    Node tail;
    //show contents
    //find largest number
    //find smallest number
    //calculate average of all numbers in list

    public IntegerLinkedList(){
            head = null;
            tail = null;
    }

    public addNum(int num){
        Node new = Node(num, null)
        if (head == null){
            head = new;
            tail = new;
        }
        else{
            tail.next = new;
            tail = new;
        }
    }

    public String show(){
        if (head == null){
            return "Empty list...no numbers to show.";
        }
        String nums = "";
        Node current = head;
        while(current.hasNext()){
            int num = current.data;
            nums += num + ", ";
            current = current.next;
        }
        nums += current.data;
        return nums;

    }

    public int largestNum() {
        //this catches a null head and alerts the user that there was no
        //data found by returning a default value  
        if(head == null){
            return -99999999;
        }

        int maxInt = head.data;
        Node current = head;
        while (current.hasNext()){
            current = current.next;
            if(current.data > maxInt){
                maxInt = current.data;
            }
        }
        return maxInt;
    }

    public int smallestNum() {
        //this catches a null head and alerts the user that there was no
        //data found by returning a default value  
        if(head == null){
            return 99999999;
        }

        Node current = head;
        int minInt = head.data;

        while (current.hasNext()){
            current = current.next;
            if(current.data < minInt){
                minInt = current.data;
            }
        }
        return minInt;
    }

    public int calculateAvg() {
        //this catches a null head and alerts the user that there was no
        //data found by returning a default value  
        if(head == null){
            return -99999999;
        }
        Node current = head;
        int sum = current.data;
        int count = 1;
        while(current.hasNext()){
            current = current.next;
            sum+= current.data;
            count++;
        }
        return Math.round(sum/count);
    }
}
