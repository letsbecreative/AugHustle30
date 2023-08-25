

/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    
    static Node reverse(Node head) {
        Node newHead = null;
        while(head!=null) {
            Node next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
    
    static Node addTwoLists(Node first, Node second){
        
        first =  reverse(first);
        second = reverse(second);
        
        Node result = new Node(0);
        Node curr = result;
        int sum = 0;
        int carry = 0;
        
        while(first!=null || second!=null) {
            
            sum = carry + (first!=null ? first.data : 0) + (second!=null ? second.data : 0);
            
            if(sum >= 10) {
                carry = sum/10;
                sum = sum%10;
            } else {
                carry = 0;
            }
            
            Node temp = new Node(sum);
            curr.next = temp;
            curr = curr.next;
            
            if(first!=null) first = first.next;
            if(second!=null) second = second.next;
        }
        
        if(carry != 0) {
            Node temp = new Node(carry);
            curr.next = temp;
        }
        
        return reverse(result.next);
        
    }
}
