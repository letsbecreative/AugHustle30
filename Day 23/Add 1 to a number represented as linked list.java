

/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    public static Node reverse(Node head) {
        Node newHead = null;
        while(head != null) {
            Node next = head.next;
            head.next =  newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
    
    public static Node addOne(Node head) 
    { 
        Node newHead = reverse(head);
        Node curr = newHead, curr1 = newHead, prev = null;
        int carry = 0;
        
        while(curr != null) {
            int sum = 0;
            if(prev == null) {
                sum = curr.data + 1;
            } else {
                sum = curr.data + carry;
            }
            
            carry = sum/10;
            curr.data = sum%10;
            prev = curr;
            curr = curr.next;
        }
        
        if(carry == 1) {
            Node newNode = new Node(1);
            prev.next = newNode;
        }
        return reverse(curr1);
    }
}
