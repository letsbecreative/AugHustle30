class Solution
{
    static void linkdelete(Node head, int M, int N)
    {
        // your code here
        Node curr=head;
        Node prev=head;
        
        while(curr!=null)
        {
            for(int i=1;(i<=M && curr!=null);i++)
            {
                prev=curr;
                curr=curr.next;
            }
            
            for(int i=1;(i<=N && curr!=null);i++)
            {
                curr=curr.next;
            }
            
            prev.next=curr;
        }

}
}


