/**
 *
 * @author Sarah Pettigrew
 * @version 11/15/2021
 */
public class Node
{   
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public boolean hasNext(Node node){
        return this.next != null;
    }

}