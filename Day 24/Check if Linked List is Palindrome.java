

/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
    public Node reverse(Node head) {
        Node newHead = null;
        while(head != null) {
            Node next = head.next;
            head.next =  newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        Node slow = head;
        Node fast = head;
        
        while(fast.next!=null && fast.next.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        slow.next = reverse(slow.next);
        slow = slow.next;
        
        while(slow != null) {
            if(head.data != slow.data) {
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }    
}
